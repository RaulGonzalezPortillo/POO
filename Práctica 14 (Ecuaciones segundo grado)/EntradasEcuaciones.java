import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EntradasEcuaciones extends JPanel
{
  static JTextField CuadroTextoEcuacion, CuadroTextoLimiteInferior, CuadroTextoLimiteSuperior, CuadroTextoDeltaX;
  static JRadioButton BotonIntegral, BotonEvaluar, BotonTabla;
  EntradasEcuaciones()
  {
    JLabel LabelTitulo, LabelEcuacion, LabelLimiteInferior, LabelLimiteSuperior, LabelDeltaX, LabelOpcion;
    Icon IconoTitulo;
    setLayout(null);
    LabelTitulo = new JLabel();
    IconoTitulo = new ImageIcon(getClass().getResource("Titulo.png"));
    LabelTitulo.setIcon(IconoTitulo);
    LabelTitulo.setBounds(25, 25, 775, 50);
    add(LabelTitulo);
    LabelEcuacion = new JLabel("Ecuación de segundo grado (ax²+bx+c)");
    LabelEcuacion.setBounds(25, 100, 375, 25);
    add(LabelEcuacion);
    LabelLimiteInferior = new JLabel("Lím. inferior");
    LabelLimiteInferior.setBounds(425, 100, 100, 25);
    add(LabelLimiteInferior);
    LabelLimiteSuperior = new JLabel("Lím. superior");
    LabelLimiteSuperior.setBounds(550, 100, 100, 25);
    add(LabelLimiteSuperior);
    LabelDeltaX = new JLabel("Δx");
    LabelDeltaX.setBounds(675, 100, 100, 25);
    add(LabelDeltaX);
    CuadroTextoEcuacion = new JTextField ("", 1);
    CuadroTextoEcuacion.setBounds(25, 125, 375, 25);
    add(CuadroTextoEcuacion);
    CuadroTextoLimiteInferior = new JTextField ("", 1);
    CuadroTextoLimiteInferior.setBounds(425, 125, 100, 25);
    add(CuadroTextoLimiteInferior);
    CuadroTextoLimiteSuperior = new JTextField ("", 1);
    CuadroTextoLimiteSuperior.setBounds(550, 125, 100, 25);
    add(CuadroTextoLimiteSuperior);
    CuadroTextoDeltaX = new JTextField ("", 1);
    CuadroTextoDeltaX.setBounds(675, 125, 100, 25);
    add(CuadroTextoDeltaX);
    LabelOpcion = new JLabel("Seleccione una opción:");
    LabelOpcion.setBounds(25, 175, 775, 33);
    add(LabelOpcion);
    ButtonGroup Grupo1 = new ButtonGroup();
    BotonIntegral = new JRadioButton("Integral");
    BotonIntegral.setBackground(new Color(220, 220, 220));
    BotonIntegral.setBounds(25, 200, 250, 33);
    Grupo1.add(BotonIntegral);
    BotonEvaluar = new JRadioButton("Evaluar en un punto");
    BotonEvaluar.setBackground(new Color(210, 210, 210));
    BotonEvaluar.setBounds(275, 200, 250, 33);
    Grupo1.add(BotonEvaluar);
    BotonTabla = new JRadioButton("Tabular");
    BotonTabla.setBackground(new Color(200, 200, 200));
    BotonTabla.setBounds(525, 200, 250, 33);
    Grupo1.add(BotonTabla);
    add(BotonIntegral);
    add(BotonEvaluar);
    add(BotonTabla);
  }
}
