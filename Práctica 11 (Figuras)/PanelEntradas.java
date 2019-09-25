import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelEntradas extends JPanel
{
  static JTextField entradaLadoCuadro, entradaBaseTriangulo, entradaAlturaTriangulo, entradaBaseRectangulo, entradaAlturaRectangulo, entradaProfundidadRectangulo;
  static JButton calculaAreaCuadro, calculaVolumenCubo, calculaAreaTriangulo, calculaVolumenPiramide, calculaAreaRectangulo, calculaVolumenPrismaRectangular;
  PanelEntradas()
  {
    setLayout(new GridLayout(15, 3));
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    entradaLadoCuadro = new JTextField ("", 3);
    add(entradaLadoCuadro);
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel("Lado", SwingConstants.CENTER));
    add(new JLabel(""));
    add(new JLabel(""));
    calculaAreaCuadro = new JButton ("Área");
    add(calculaAreaCuadro);
    calculaVolumenCubo = new JButton ("Volumen");
    add(calculaVolumenCubo);
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));

    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    entradaBaseTriangulo = new JTextField ("", 3);
    add(entradaBaseTriangulo);
    entradaAlturaTriangulo = new JTextField ("", 3);
    add(entradaAlturaTriangulo);
    add(new JLabel(""));
    add(new JLabel("Base", SwingConstants.CENTER));
    add(new JLabel("Altura", SwingConstants.CENTER));
    add(new JLabel(""));
    calculaAreaTriangulo = new JButton ("Área");
    add(calculaAreaTriangulo);
    calculaVolumenPiramide = new JButton ("Volumen");
    add(calculaVolumenPiramide);
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));

    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    entradaBaseRectangulo = new JTextField ("", 3);
    add(entradaBaseRectangulo);
    entradaAlturaRectangulo = new JTextField ("", 3);
    add(entradaAlturaRectangulo);
    entradaProfundidadRectangulo = new JTextField ("", 3);
    add(entradaProfundidadRectangulo);
    add(new JLabel("Base", SwingConstants.CENTER));
    add(new JLabel("Altura", SwingConstants.CENTER));
    add(new JLabel("Profundidad", SwingConstants.CENTER));
    calculaAreaRectangulo = new JButton ("Área");
    add(calculaAreaRectangulo);
    calculaVolumenPrismaRectangular = new JButton ("Volumen");
    add(calculaVolumenPrismaRectangular);
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
    add(new JLabel(""));
  }
}
