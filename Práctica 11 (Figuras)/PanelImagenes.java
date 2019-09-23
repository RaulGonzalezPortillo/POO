import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class PanelImagenes extends JPanel
{
  PanelImagenes () {
    setLayout(new GridLayout(3,1));
    JLabel Etiqueta = new JLabel();
    Etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Cuadro = new ImageIcon(getClass().getResource ("Cuadro.png"));
    Etiqueta.setText("Cuadro");
    Etiqueta.setIcon(Cuadro);
    this.add(Etiqueta);
    JLabel Etiqueta2 = new JLabel();
    Icon Cubo = new ImageIcon(getClass().getResource("Cubo.png"));
    Etiqueta2.setText("Cubo");
    Etiqueta2.setIcon(Cubo);
    this.add(Etiqueta2);
    JLabel Etiqueta3 = new JLabel();
    Icon Triangulo = new ImageIcon(getClass().getResource("Triangulo.png"));
    Etiqueta3.setText ("Triangulo");
    Etiqueta3.setIcon (Triangulo);
    this.add (Etiqueta3);
    JLabel Etiqueta4 = new JLabel();
    Icon Piramide = new ImageIcon(getClass().getResource("Piramide.png"));
    Etiqueta4.setText("Piramide");
    Etiqueta4.setIcon(Piramide);
    this.add(Etiqueta4);
    JLabel Etiqueta5 = new JLabel();
    Icon Rectangulo = new ImageIcon(getClass().getResource("Rectangulo.png"));
    Etiqueta5.setText("Rectangulo");
    Etiqueta5.setIcon(Rectangulo);
    this.add(Etiqueta5);
    JLabel Etiqueta6 = new JLabel();
    Icon PrismaRectangular = new ImageIcon(getClass().getResource("PrismaRectangular.png"));
    Etiqueta6.setText("PrismaRectangular");
    Etiqueta6.setIcon(PrismaRectangular);
    this.add(Etiqueta6);
  }
}
