import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class BotonesEcuaciones extends JPanel
{
  static JCheckBox BotonIntegral, BotonEvaluar, BotonTabla;
  static JButton BotonAccion;
  BotonesEcuaciones()
  {
    setLayout(new GridLayout(2, 3));
    add(new JLabel("Seleccione una opción:"));
    add(new JLabel(""));
    add(new JLabel(""));
    BotonIntegral = new JCheckBox("Integral");
    add(BotonIntegral);
    BotonEvaluar = new JCheckBox("Evaluar en un punto");
    add(BotonEvaluar);
    BotonTabla = new JCheckBox("Tabular");
    add(BotonTabla);
  }
}
