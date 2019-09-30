import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManejadorTendenciaCentral implements ActionListener
{
  public void actionPerformed (ActionEvent Evento)
  {
    if (Evento.getSource() == EntradasTendenciaCentral.BotonImprimir)
    {
      try
      {
        FrameTendencias.PanelTabla.removeAll();

        int Numero1 = Integer.parseInt(EntradasTendenciaCentral.CantidadValores.getText().toString());
        FrameTendencias.Datos = new String[Numero1][2];

        for(int Fila = 0; Fila < FrameTendencias.Datos.length; Fila++)
        {
          for(int Columna = 0; Columna < FrameTendencias.Datos[0].length; Columna++)
          {
            FrameTendencias.Datos[Fila][Columna] = String.valueOf(Fila);
          }
        }

        FrameTendencias.PanelTabla.updateUI();
        FrameTendencias.PanelTabla.repaint();

        FrameTendencias.Tabla = new JTable(FrameTendencias.Datos, FrameTendencias.NombresColumnas);

        JScrollPane tableContainer = new JScrollPane(FrameTendencias.Tabla);
        FrameTendencias.PanelTabla.add(tableContainer);
      }
      catch (Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introduzca un número con dos cifras", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if (Evento.getSource() == PanelCalcularResultados.BotonMedia)
    {
      try
      {
        double Resultado;
        Resultado = 0;
        for (int Fila = 0; Fila < FrameTendencias.Datos.length; Fila++)
        {
          Resultado += Double.parseDouble(String.valueOf(FrameTendencias.Tabla.getValueAt(Fila, 1)));
          //getValueAt regresa un objeto, el cual puede ser asignado a una String con valueOf, el cual después puede ser convertido a un Double para trabajarlo.
          //Ya sé...está horrible xD.
        }
        Resultado /= FrameTendencias.Datos.length;
        PanelCalcularResultados.ResultadoMedia.setText(Double.toString(Resultado));
      }
      catch (Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introduzca números en la tabla", "Error de entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
