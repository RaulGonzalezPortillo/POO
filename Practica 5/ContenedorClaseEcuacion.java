import java.util.Scanner;

public class ContenedorClaseEcuacion
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    ClaseEcuacion objetoEcuacion = new ClaseEcuacion ();
    System.out.println ("Ingresa el coeficiente a (x²)");
    double a = scan.nextFloat ();
    System.out.println ("Ingresa el coeficiente b (x)");
    double b = scan.nextFloat ();
    System.out.println ("Ingresa el coeficiente c");
    double c = scan.nextFloat ();
    if (a == 0)
    {
      System.out.println ("El programa no puede continuar pues el coeficiente a = 0");
    }
    else
    {
      objetoEcuacion.puntosCorte (a, b, c);
      objetoEcuacion.puntosVertice (a, b, c);
      objetoEcuacion.convexidad (a);
    }
  }
}
