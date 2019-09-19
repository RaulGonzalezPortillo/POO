import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GridPrincipal extends JPanel
{
  public GridPrincipal () {
    System.out.println ("Hola");
    setSize (700, 700);
    setBackground (Color.yellow);
    ExFlowLayout panelDos = new ExFlowLayout ();
    this.add (panelDos);
    JButton Boton1 = new JButton (panelDos);
    JButton Boton2 = new JButton ("B2");
    JButton Boton3 = new JButton ("B3");
    setLayout (new GridLayout (3, 1));
    this.add (panelDos);
    this.add (Boton2);
    this.add (Boton3);
  }
}
