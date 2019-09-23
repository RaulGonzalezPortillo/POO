import java.util.Scanner;

public class ContenedorClaseDado
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    int Intento;
    String Lector;
    ClaseDado objetoDado = new ClaseDado ();
    System.out.println ("Bienvenido al juego del dado®!");
    do
    {
      objetoDado.Lanzar (6, 1);
      System.out.println ("¿Que número crees que salió?");
      do
      {
        System.out.println ("Ingrese un número del 1 al 6");
        Intento = scan.nextInt ();
        Lector = scan.nextLine ();
      }
      while (Intento < 1 || Intento > 7);
      objetoDado.Comparar (Intento);
      System.out.println ("¿Quiere jugar otra vez? (introduzca 'Si' para volver a jugar)");
      Lector = scan.nextLine ();
    }
    while ((Lector.equals("Si")));
    System.out.println ("Hizo " + objetoDado.getCadenaIntentos() + " intentos de los cuales, tuvo " + objetoDado.getCadenaAciertos() + " aciertos");
  }
}
