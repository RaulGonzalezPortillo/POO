import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.JScrollPane;

public class FrameFormulario extends JFrame
{
  FrameFormulario()
  {
    super("Datos de identificación");
    setSize(1200, 750);
    setLocation (75, 0);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    EntradasFormulario Entradas = new EntradasFormulario();
    this.add(Entradas);
    ManejadorFormulario Manejador = new ManejadorFormulario();
    EntradasFormulario.BotonGuardar.addActionListener(Manejador);
  }
}
