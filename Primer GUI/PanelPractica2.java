import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelPractica2 extends JPanel
{
  public PanelPractica2 () {
    setSize (700, 200);
    setBackground (Color.yellow);
    JLabel etiqueta = new JLabel ("Nombre: ");
    JTextField texto = new JTextField (10);
    JButton boton = new JButton ("Aceptar");
    setLayout (new FlowLayout());
    this.add (etiqueta);
    this.add (texto);
    this.add (boton);
  }
}
