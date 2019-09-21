import javax.swing.JFrame;
import java.awt.GridLayout;

public class PrimerGUI extends JFrame
{
  public PrimerGUI ()
  {
    super ("Título de ventana");
    setSize (700, 600);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocation (300, 75);
    setResizable (true);
    setLayout(new GridLayout(3,1));
    /*PrimerPanel panelUno = new PrimerPanel ();
    this.add (panelUno);*/
    ExFlowLayout panelDos = new ExFlowLayout ();
    this.add (panelDos);
    ExGridLayout panelTres = new ExGridLayout ();
    this.add (panelTres);
    ExBorderLayout panelCuatro = new ExBorderLayout ();
    this.add (panelCuatro);
  }
}
