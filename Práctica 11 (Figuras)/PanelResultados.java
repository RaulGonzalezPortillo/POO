import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class PanelResultados extends JPanel
{
  static JLabel resultadoCuadroCubo, resultadoTrianguloPiramide, resultadoRectanguloPrismaRectangular;
  PanelResultados()
  {
    setLayout(new GridLayout (3,1));
    resultadoCuadroCubo = new JLabel ("Resultado a calcular", SwingConstants.CENTER);
    this.add (resultadoCuadroCubo);
    resultadoTrianguloPiramide = new JLabel ("Resultado a calcular", SwingConstants.CENTER);
    this.add (resultadoTrianguloPiramide);
    resultadoRectanguloPrismaRectangular = new JLabel ("Resultado a calcular", SwingConstants.CENTER);
    this.add (resultadoRectanguloPrismaRectangular);
  }
}
