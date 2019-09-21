import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ExGridLayout extends JPanel
{
  public ExGridLayout()
  {
    setSize (700, 200);
    setBackground (Color.green);
    JTextField texto = new JTextField (10);
    ExBorderLayout cuadro1 = new ExBorderLayout ();
    JButton cuadro2 = new JButton ("B2");
    ExFlowLayout cuadro3 = new ExFlowLayout ();
    ExFlowLayout cuadro4 = new ExFlowLayout ();
    JButton cuadro5 = new JButton ("B5");
    ExBorderLayout cuadro6 = new ExBorderLayout ();
    setLayout (new GridLayout (2,3));
    this.add (cuadro1);
    this.add (cuadro2);
    this.add (cuadro3);
    this.add (cuadro4);
    this.add (cuadro5);
    this.add (cuadro6);
  }
}
