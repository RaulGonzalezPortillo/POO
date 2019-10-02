import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EntradaEcuaciones extends JPanel
{
  static JTextField CuadroTextoEcuacion;
  EntradaEcuaciones()
  {
    setLayout(new GridLayout(2, 1));
    add(new JLabel("Ecuación de segundo grado"));
    CuadroTextoEcuacion = new JTextField ("", 1);
    add(CuadroTextoEcuacion);
  }
}
