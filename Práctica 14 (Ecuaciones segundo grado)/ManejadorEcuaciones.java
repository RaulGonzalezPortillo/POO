import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManejadorEcuaciones implements ActionListener
{
  static int ErrorEcuacion;
  static double LimiteInferior, LimiteSuperior, DeltaX, ResultadoEvaluacion;
  static int[] Coeficientes;
  public void actionPerformed(ActionEvent Evento)
  {
    if(EntradasEcuaciones.BotonIntegral.isSelected())
    {
      try
      {
        double ResultadoIntegral;
        ResultadoIntegral = 0;
        ProcesarEcuacion();
        ProcesarLimiteInferior();
        ProcesarLimiteSuperior();
        ProcesarDeltaX();
        if (ErrorEcuacion == 0 && DeltaX > 0)
        {
          for(; LimiteInferior <= LimiteSuperior; LimiteInferior += DeltaX)
          {
            Evaluar(LimiteInferior);
            ResultadoIntegral += DeltaX * ResultadoEvaluacion;
          }
          JOptionPane.showMessageDialog(null, "El resultado es: " + String.valueOf(ResultadoIntegral), "Operación completada", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
          if (DeltaX <= 0)
          {
            JOptionPane.showMessageDialog(null, "Δx no puede ser menor o igual a 0", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
          }
        }
      }
      catch(Exception E)
      {
        JOptionPane.showMessageDialog(null, "No se pudo realizar la conversión de alguna de las entradas, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if(EntradasEcuaciones.BotonEvaluar.isSelected())
    {
      try
      {
        String LectorPunto;
        int Punto;
        ProcesarEcuacion();
        if (ErrorEcuacion == 0)
        {
          LectorPunto = JOptionPane.showInputDialog("Ingrese el punto que quiere evaluar en la función");
          if (LectorPunto != null)
          {
            Punto = Integer.parseInt (LectorPunto);
            Evaluar(Punto);
            JOptionPane.showMessageDialog(null, "El resultado es: " + String.valueOf(ResultadoEvaluacion), "Operación completada", JOptionPane.INFORMATION_MESSAGE);
          }
        }
      }
      catch(Exception E)
      {
        JOptionPane.showMessageDialog(null, "No se pudo realizar la conversión de alguna de las entradas, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if(EntradasEcuaciones.BotonTabla.isSelected())
    {
      try
      {
        int Filas, i;
        Filas = 0;
        ProcesarEcuacion();
        ProcesarLimiteInferior();
        ProcesarLimiteSuperior();
        ProcesarDeltaX();
        double TempLimiteInferior = LimiteInferior;
        if (ErrorEcuacion == 0 && DeltaX > 0)
        {
          FrameEcuaciones.PanelTabla.removeAll();
          for (; TempLimiteInferior <= LimiteSuperior; TempLimiteInferior += DeltaX)
          {
            Filas++;
          }
          FrameEcuaciones.Datos = new String [Filas][3];
          i = 0;
          for (; LimiteInferior <= LimiteSuperior; LimiteInferior += DeltaX)
          {
            FrameEcuaciones.Datos[i][0] = String.valueOf(i);
            FrameEcuaciones.Datos[i][1] = String.valueOf(LimiteInferior);
            Evaluar(LimiteInferior);
            FrameEcuaciones.Datos[i][2] = String.valueOf(ResultadoEvaluacion);
            i++;
          }
          FrameEcuaciones.PanelTabla.updateUI();
          FrameEcuaciones.PanelTabla.repaint();
          FrameEcuaciones.Tabla = new JTable(FrameEcuaciones.Datos, FrameEcuaciones.NombresColumnas);
          JScrollPane tableContainer = new JScrollPane(FrameEcuaciones.Tabla);
          FrameEcuaciones.PanelTabla.add(tableContainer);
        }
        else
        {
          if (DeltaX <= 0)
          {
            JOptionPane.showMessageDialog(null, "Δx no puede ser menor o igual a 0", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
          }
        }
      }
      catch(Exception E)
      {
        JOptionPane.showMessageDialog(null, "No se pudo realizar la conversión de alguna de las entradas, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  public void ProcesarEcuacion()
  {
    int Longitud1, Longitud2, Longitud3;
    ErrorEcuacion = 0;
    Coeficientes = new int [3];
    String LectorEcuacion = EntradasEcuaciones.CuadroTextoEcuacion.getText().toString();
    String[] EcuacionSeparada = LectorEcuacion.split("(?=[-+])");
    if (EcuacionSeparada.length == 3)
    {
      Longitud1 = EcuacionSeparada[0].length();
      if (EcuacionSeparada[0].charAt(Longitud1 - 2) == 'x' && EcuacionSeparada[0].charAt(Longitud1 - 1) == '²')
        Coeficientes[0] = Integer.parseInt(EcuacionSeparada[0].substring(0, Longitud1 - 2));
      else
      {
        JOptionPane.showMessageDialog(null, "Error de sintaxis en coeficiente a, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        ErrorEcuacion = 1;
      }
      Longitud2 = EcuacionSeparada[1].length();
      if (EcuacionSeparada[1].charAt(Longitud2 - 1) == 'x')
        Coeficientes[1] = Integer.parseInt(EcuacionSeparada[1].substring(0, Longitud2 - 1));
      else
      {
        JOptionPane.showMessageDialog(null, "Error de sintaxis en coeficiente b, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        ErrorEcuacion = 1;
      }
      Longitud3 = EcuacionSeparada[2].length();
      if (EcuacionSeparada[2].charAt(Longitud3 - 1) >= '0' && EcuacionSeparada[2].charAt(Longitud3 - 1) <= '9')
        Coeficientes[2] = Integer.parseInt(EcuacionSeparada[2].substring(0, Longitud3));
      else
      {
        JOptionPane.showMessageDialog(null, "Error de sintaxis en coeficiente c, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        ErrorEcuacion = 1;
      }
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Se introdujo una cantidad de coeficientes inválida, intente de nuevo", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      ErrorEcuacion = 1;
    }
  }
  public void ProcesarLimiteInferior()
  {
    String LectorLimiteInferior = EntradasEcuaciones.CuadroTextoLimiteInferior.getText().toString();
    LimiteInferior = Double.parseDouble(LectorLimiteInferior);
  }
  public void ProcesarLimiteSuperior()
  {
    String LectorLimiteSuperior = EntradasEcuaciones.CuadroTextoLimiteSuperior.getText().toString();
    LimiteSuperior = Double.parseDouble(LectorLimiteSuperior);
  }
  public void ProcesarDeltaX()
  {
    String LectorDeltaX = EntradasEcuaciones.CuadroTextoDeltaX.getText().toString();
    DeltaX = Double.parseDouble(LectorDeltaX);
  }
  public void Evaluar(double X)
  {
    ResultadoEvaluacion = (Coeficientes[0] * Math.pow(X, 2)) + (Coeficientes[1] * X) + Coeficientes[2];
  }
}
