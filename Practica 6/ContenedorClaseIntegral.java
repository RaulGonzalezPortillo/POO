import java.util.Scanner;

public class ContenedorClaseIntegral
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    ClaseIntegral objetoIntegral = new ClaseIntegral ();
    System.out.println ("Ingresa el valor de Δx");
    double Δx = scan.nextDouble ();
    objetoIntegral.calcularIntegral (Δx);
    System.out.println ("La integral definida de x² + 1 desde -1 hasta 2 es: " + objetoIntegral.getIntegral ());
  }
}
