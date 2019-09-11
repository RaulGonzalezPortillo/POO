import java.util.Scanner;

public class ContenedorClaseMediaFrecuencia
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    int Lector, Temp;
    ClaseMediaFrecuencia objetoMedia = new ClaseMediaFrecuencia ();
    System.out.println ("Ingrese la cantidad de números a leer");
    int Cantidad = scan.nextInt ();
    int Arreglo [] = new int [Cantidad];
    System.out.println ("Ingrese los siguientes valores");
    System.out.println ("Valor 1:");
    Arreglo [0] = scan.nextInt ();
    for (int i = 1; i < Cantidad; i ++)
    {
      System.out.println ("Valor " +  (i + 1) + ":");
      Arreglo [i] = scan.nextInt ();
      for (int j = i - 1 ; j < 0; j ++)
      {
        if (Arreglo [j] > Arreglo [i])
        {
          Temp = Arreglo [j];
          Arreglo [j] = Arreglo [i];
          Arreglo [i] = Temp;
        }
      }
    }
    for (int i = 0; i < Cantidad; i ++)
    {
      System.out.println (Arreglo [i]);
    }
    objetoMedia.calcularMedia (Arreglo, Cantidad);
    System.out.println ("La media aritmética es = " + objetoMedia.getMedia ());
  }
}
