import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

enum Caracteristica
{
  MAYORPESO, FRECUENCIAALTA, MAYORTREINTA;
}

public class CheckButt extends JPanel
{
  static JLabel Texto1;
  static JCheckBox MayorPeso, FrecuenciaAlta, MayorEdad;
  static JButton Diagnostico;

  CheckButt()
  {
    setLayout(null);
    Texto1 = new JLabel("Selecciona opciones", SwingConstants.CENTER);
    //x, y, width, height
    Texto1.setBounds(190, 22, 135, 25);
    add(Texto1);
    MayorPeso = new JCheckBox("Obesidad");
    MayorPeso.setBounds(70, 70, 120, 25);
    FrecuenciaAlta = new JCheckBox("Frecuencia alta");
    FrecuenciaAlta.setBounds(192, 70, 120, 25);
    MayorEdad = new JCheckBox("Mayor Treinta");
    MayorEdad.setBounds(320, 70, 120, 25);
    add(MayorPeso);
    add(FrecuenciaAlta);
    add(MayorEdad);
    Diagnostico = new JButton("Diagnostico");
    Diagnostico.setBounds(190, 140, 120, 25);
    add(Diagnostico);
  }
}
