import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.*;

public class FrameEcuaciones extends JFrame
{
  FrameEcuaciones()
  {
    super("Ecuaciones de segundo grado");
    setSize(800, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridLayout(2,1));
    EntradaEcuaciones Entrada = new EntradaEcuaciones();
    Entrada.setBorder(new EmptyBorder(0, 25, 25, 25)); //Arriba, Izquierda, Abajo, Derecha
    this.add(Entrada);
    BotonesEcuaciones Botones = new BotonesEcuaciones();
    Botones.setBorder(new EmptyBorder(0, 25, 25, 25));
    this.add(Botones);
  }
}
