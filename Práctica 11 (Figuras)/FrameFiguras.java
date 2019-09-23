import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrameFiguras extends JFrame
{
  public FrameFiguras()
  {
    super("Área y volumen de distintas figuras");
    setSize (900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(300, 75);
    setResizable(true);
    setLayout(new GridLayout(1,3));
    PanelImagenes Imagenes = new PanelImagenes();
    this.add(Imagenes);
    PanelEntradas Entradas = new PanelEntradas();
    this.add(Entradas);
    PanelResultados Resultados = new PanelResultados ();
    this.add(Resultados);
  }
}
