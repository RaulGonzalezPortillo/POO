import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ManejadorEventosFiguras implements ActionListener
{
  public void actionPerformed (ActionEvent Evento)
  {
    if (Evento.getSource() == PanelEntradas.calculaAreaCuadro || Evento.getSource() == PanelEntradas.calculaVolumenCubo)
    {
      try
      {
        int LectorLado = Integer.parseInt(PanelEntradas.entradaLadoCuadro.getText().substring(0,1));
        if (Evento.getSource() == PanelEntradas.calculaAreaCuadro)
        {
          double Resultado = Math.pow((double)LectorLado, 2);
          PanelResultados.resultadoCuadroCubo.setText ("El área es: " + Double.toString(Resultado));
        }
        else
        {
          double Resultado = Math.pow((double)LectorLado, 3);
          PanelResultados.resultadoCuadroCubo.setText ("El volumen es: " + Double.toString(Resultado));
        }
      }
      catch (Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introduzca exclusivamente numeros", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if (Evento.getSource() == PanelEntradas.calculaAreaTriangulo || Evento.getSource() == PanelEntradas.calculaVolumenPiramide)
    {
      try
      {
        int LectorBase = Integer.parseInt(PanelEntradas.entradaBaseTriangulo.getText().substring(0,1));
        int LectorAltura = Integer.parseInt(PanelEntradas.entradaAlturaTriangulo.getText().substring(0,1));
        if (Evento.getSource() == PanelEntradas.calculaAreaTriangulo)
        {
          double Resultado = (double)(LectorBase*LectorAltura/2);
          PanelResultados.resultadoTrianguloPiramide.setText ("El área es: " + Double.toString(Resultado));
        }
        else
        {
          double Resultado = (double)(LectorBase*LectorAltura/3);
          PanelResultados.resultadoTrianguloPiramide.setText ("El volumen es: " + Double.toString(Resultado));
        }
      }
      catch (Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introduzca exclusivamente numeros", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if (Evento.getSource() == PanelEntradas.calculaAreaRectangulo || Evento.getSource() == PanelEntradas.calculaVolumenPrismaRectangular)
    {
      try
      {
        int LectorBase = Integer.parseInt(PanelEntradas.entradaBaseRectangulo.getText().substring(0,1));
        int LectorAltura = Integer.parseInt(PanelEntradas.entradaAlturaRectangulo.getText().substring(0,1));
        if (Evento.getSource() == PanelEntradas.calculaAreaRectangulo)
        {
          double Resultado = (double)(LectorBase*LectorAltura);
          PanelResultados.resultadoRectanguloPrismaRectangular.setText ("El área es: " + Double.toString(Resultado));
        }
        else
        {
          int LectorProfundidad = Integer.parseInt(PanelEntradas.entradaProfundidadRectangulo.getText().substring(0,1));
          double Resultado = (double)(LectorBase*LectorAltura*LectorProfundidad);
          PanelResultados.resultadoRectanguloPrismaRectangular.setText ("El volumen es: " + Double.toString(Resultado));
        }
      }
      catch (Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introduzca exclusivamente numeros", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
