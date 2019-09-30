import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EventosCheck implements ActionListener
{
  public void actionPerformed (ActionEvent Evento)
  {
    if (Evento.getSource() == CheckButt.Diagnostico)
    {
      try
      {
        int Contador = 0;
        if (CheckButt.MayorPeso.isSelected())
          Contador++;
        if (CheckButt.FrecuenciaAlta.isSelected())
          Contador++;
        if (CheckButt.MayorEdad.isSelected())
          Contador++;
        System.out.println(Contador);
        if(Contador >= 2)
        {
          JOptionPane.showMessageDialog(null, "Validar más datos", "Salida diagnóstico", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Todo OK", "Salida diagnóstico", JOptionPane.ERROR_MESSAGE);
        }
      }
      catch(Exception E)
      {
        JOptionPane.showMessageDialog(null, "Introducir sólo numeros: ", "Error de entrada", JOptionPane.ERROR_MESSAGE);
      }
    }
    if (PanelRadioButton.Ninguna.isSelected())
    {
      JOptionPane.showMessageDialog(null, "Opción NINGUNA", "Respiración", JOptionPane.ERROR_MESSAGE);
    }
  }
}
