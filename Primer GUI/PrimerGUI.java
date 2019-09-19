import javax.swing.JFrame;

public class PrimerGUI extends JFrame
{
  public PrimerGUI ()
  {
    super ("Título de ventana");
    setSize (700, 700);
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocation (300, 300);
    setResizable (true);
    /*PrimerPanel panelUno = new PrimerPanel ();
    this.add (panelUno);*/
    /*ExFlowLayout panelDos = new ExFlowLayout ();
    this.add (panelDos);*/
    GridPrincipal panelTres = new GridPrincipal ();
    this.add (panelTres);
  }
}
