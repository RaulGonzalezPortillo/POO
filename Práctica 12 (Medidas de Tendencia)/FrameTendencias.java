import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel ;
import javax.swing.JTable;

public class FrameTendencias extends JFrame
{
  static String Datos[][];
  static JTable Tabla;
  static String[] NombresColumnas = {"Dato", "Valor"};
  static JPanel PanelTabla;

  FrameTendencias()
  {
    super ("Medidas de tendencia");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridLayout(3,1));
    EntradasTendenciaCentral PanelEntradas = new EntradasTendenciaCentral();
    this.add(PanelEntradas);

    PanelTabla = new JPanel();
    PanelTabla.setLayout(new BorderLayout());
    this.add(PanelTabla);

    PanelCalcularResultados CalcularResultados = new PanelCalcularResultados();
    this.add(CalcularResultados);

    ManejadorTendenciaCentral Manejador = new ManejadorTendenciaCentral();
    PanelEntradas.BotonImprimir.addActionListener(Manejador);
    PanelCalcularResultados.BotonMedia.addActionListener(Manejador);
  }
}
