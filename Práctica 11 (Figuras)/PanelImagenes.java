import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class PanelImagenes extends JPanel
{
  PanelImagenes ()
  {
    setLayout(new GridLayout(3,1));
    JLabel Etiqueta = new JLabel();
    Etiqueta.setText("Cuadro");
    Etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Cuadro = new ImageIcon(getClass().getResource ("Cuadro.png"));
    Etiqueta.setIcon(Cuadro);
    this.add(Etiqueta);
    JLabel Etiqueta2 = new JLabel();
    Etiqueta2.setText("Cubo");
    Etiqueta2.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta2.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Cubo = new ImageIcon(getClass().getResource("Cubo.png"));
    Etiqueta2.setIcon(Cubo);
    this.add(Etiqueta2);
    JLabel Etiqueta3 = new JLabel();
    Etiqueta3.setText ("Triangulo");
    Etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Triangulo = new ImageIcon(getClass().getResource("Triangulo.png"));
    Etiqueta3.setIcon (Triangulo);
    this.add (Etiqueta3);
    JLabel Etiqueta4 = new JLabel();
    Etiqueta4.setText("Piramide");
    Etiqueta4.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta4.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Piramide = new ImageIcon(getClass().getResource("Piramide.png"));
    Etiqueta4.setIcon(Piramide);
    this.add(Etiqueta4);
    JLabel Etiqueta5 = new JLabel();
    Etiqueta5.setText("Rectangulo");
    Etiqueta5.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta5.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon Rectangulo = new ImageIcon(getClass().getResource("Rectangulo.png"));
    Etiqueta5.setIcon(Rectangulo);
    this.add(Etiqueta5);
    JLabel Etiqueta6 = new JLabel();
    Etiqueta6.setText("Prisma Rectangular");
    Etiqueta6.setHorizontalTextPosition(SwingConstants.CENTER);
    Etiqueta6.setVerticalTextPosition(SwingConstants.BOTTOM);
    Icon PrismaRectangular = new ImageIcon(getClass().getResource("PrismaRectangular.png"));
    Etiqueta6.setIcon(PrismaRectangular);
    this.add(Etiqueta6);
  }
}
