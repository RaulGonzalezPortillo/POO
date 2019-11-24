import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class FrameClinica extends JFrame {
  FrameClinica() {
    super("Administrador de citas - Clinica del Adulto Mayor");
    setSize(900, 600);
    setLocation (150, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setIconImage(new ImageIcon(getClass().getResource("ClinicaLogoBorde.png")).getImage());
    EntradasClinica Entradas = new EntradasClinica();
    this.add(Entradas);
    ManejadorClinica Manejador = new ManejadorClinica();
    EntradasClinica.BotonAgendar.addActionListener(Manejador);
  }
}
