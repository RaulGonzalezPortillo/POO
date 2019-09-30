import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel ;
import javax.swing.JTable;

public class FrameBotonesRadio extends JFrame
{

  FrameBotonesRadio()
  {
    super ("Medidas de tendencia");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridLayout(2,1));
    CheckButt BotonesCheck = new CheckButt();
    this.add(BotonesCheck);

    PanelRadioButton BotonesRadio = new PanelRadioButton();
    this.add(BotonesRadio);

    EventosCheck Manejador = new EventosCheck();
    CheckButt.Diagnostico.addActionListener(Manejador);
  }
}
