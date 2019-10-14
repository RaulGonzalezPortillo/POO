import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.*;

public class FrameEcuaciones extends JFrame
{
  static String Datos[][];
  static JTable Tabla;
  static String[] NombresColumnas = {"#", "x", "f(x)"};
  static JPanel PanelTabla;
  FrameEcuaciones()
  {
    super("Ecuaciones de segundo grado");
    setSize(800, 575);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLayout(new GridLayout(2,1));
    EntradasEcuaciones Entradas = new EntradasEcuaciones();
    this.add(Entradas);
    PanelTabla = new JPanel();
    PanelTabla.setLayout(new BorderLayout());
    PanelTabla.setBorder(new EmptyBorder(0, 25, 25, 25)); //Arriba, Izquierda, Abajo, Derecha
    this.add(PanelTabla);
    ManejadorEcuaciones Manejador = new ManejadorEcuaciones();
    EntradasEcuaciones.CuadroTextoEcuacion.addActionListener(Manejador);
    EntradasEcuaciones.CuadroTextoLimiteInferior.addActionListener(Manejador);
    EntradasEcuaciones.CuadroTextoLimiteSuperior.addActionListener(Manejador);
    EntradasEcuaciones.CuadroTextoDeltaX.addActionListener(Manejador);
    EntradasEcuaciones.BotonIntegral.addActionListener(Manejador);
    EntradasEcuaciones.BotonEvaluar.addActionListener(Manejador);
    EntradasEcuaciones.BotonTabla.addActionListener(Manejador);
  }
}
