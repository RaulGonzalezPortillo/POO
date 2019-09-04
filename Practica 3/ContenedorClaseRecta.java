import java.util.Scanner;

public class ContenedorClaseRecta {
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args) {
    ClaseRecta objetoRecta1 = new ClaseRecta ();
    ClaseRecta objetoRecta2 = new ClaseRecta ();
    System.out.println ("Ingresa el valor de X1 de la recta 1: ");
    float X1R1 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de Y1 de la recta 1: ");
    float Y1R1 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de X2 de la recta 1: ");
    float X2R1 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de Y2 de la recta 1: ");
    float Y2R1 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de X1 de la recta 2: ");
    float X1R2 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de Y1 de la recta 2: ");
    float Y1R2 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de X2 de la recta 2: ");
    float X2R2 = scan.nextFloat ();
    System.out.println ("Ingresa el valor de Y2 de la recta 2: ");
    float Y2R2 = scan.nextFloat ();
    objetoRecta1.calcularPendiente (X1R1, Y1R1, X2R1, Y2R1);
    objetoRecta1.calcularOrdenada (X1R1, Y1R1, X2R1, Y2R1);
    System.out.println ("La ecuación de la recta 1 es: " + objetoRecta1.getPendiente () + "x + " + objetoRecta1.getOrdenada ());
    System.out.println ("Su pendiente es: " + objetoRecta1.getPendiente ());
    System.out.println ("Corta al eje y en: " + objetoRecta1.getOrdenada ());
    objetoRecta2.calcularPendiente (X1R2, Y1R2, X2R2, Y2R2);
    objetoRecta2.calcularOrdenada (X1R2, Y1R2, X2R2, Y2R2);
    System.out.println ("La ecuación de la recta 2 es: " + objetoRecta2.getPendiente () + "x + " + objetoRecta2.getOrdenada ());
    System.out.println ("Su pendiente es: " + objetoRecta2.getPendiente ());
    System.out.println ("Corta al eje y en: " + objetoRecta2.getOrdenada ());
    objetoRecta1.interseccion (objetoRecta2.getPendiente (), objetoRecta2.getOrdenada ());
    System.out.println ("El angulo entre rectas es: " + objetoRecta1.angulo (objetoRecta2.getPendiente ()));
  }
}
