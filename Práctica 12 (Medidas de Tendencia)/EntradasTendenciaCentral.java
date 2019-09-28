import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EntradasTendenciaCentral extends JPanel
{
  static JLabel Texto1;
  static JTextField CantidadValores;
  static JButton BotonImprimir;

  EntradasTendenciaCentral()
  {
    setLayout(null);
    Texto1 = new JLabel("Número de datos", SwingConstants.CENTER);
    Texto1.setBounds(20, 45, 125, 25); //X, Y, Ancho, Alto
    add(Texto1);
    CantidadValores = new JTextField("", 3);
    CantidadValores.setBounds (150, 45, 120, 25);
    add(CantidadValores);
    BotonImprimir = new JButton("Ingresa datos");
    BotonImprimir.setBounds(280, 45, 130, 25);
    add(BotonImprimir);
  }
}
