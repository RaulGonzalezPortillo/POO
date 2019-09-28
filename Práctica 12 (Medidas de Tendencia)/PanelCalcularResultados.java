import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelCalcularResultados extends JPanel
{
  static JButton BotonMedia;
  static JLabel ResultadoMedia;
  PanelCalcularResultados()
  {
    setLayout(new GridLayout(3, 4));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    BotonMedia = new JButton("Media");
    this.add(BotonMedia);
    this.add(new JLabel("Media:", SwingConstants.CENTER));
    ResultadoMedia = new JLabel("...");
    this.add(ResultadoMedia);
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
    this.add(new JLabel(""));
  }
}
