import javax.swing.JOptionPane;

public class PruebaObtenerDeVentana {
  public static void main (String[] args) {
    String datoentrada;
    datoentrada = JOptionPane.showInputDialog ("Ingresa un entero");
    //Operadores
    //k = 3
    int k = Integer.parseInt (datoentrada);
    JOptionPane.showMessageDialog (null, k, "Valor del usuario", JOptionPane.INFORMATION_MESSAGE);
    int j = 2;
    int rescero = k / j;
    //Los resultados de las operaciones conservan el tipo de dato con el que fueron declarados.
    double resuno = k / j;
    double a = 3, b = 2;
    double resdos = a / b;
    int restres = 3 * 2;
    System.out.println (rescero);
    System.out.println (resuno);
    System.out.println (resdos);
    System.out.println (restres);
  }
}
