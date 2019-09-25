import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class FrameTendencias extends JFrame
{
  static String Datos[][];
  static JTable Tabla;
  static String[] columnNames = {"Dato", "Valor"};
  static Jpanel panelTable;

  FrameTendencias()
  {
    super ("Medidas de tendencia");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(true);
    setLayout(new GridLayout(2,1));
  }
}
