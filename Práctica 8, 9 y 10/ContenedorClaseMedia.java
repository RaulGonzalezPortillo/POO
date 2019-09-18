import java.util.Scanner;

public class ContenedorClaseMedia
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    ClaseMedia objetoMedia = new ClaseMedia ();
    System.out.println ("Ingrese la cantidad de números a leer");
    int Cantidad = scan.nextInt ();
    int Arreglo [] = new int [Cantidad];
    System.out.println ("Ingrese los siguientes valores");
    for (int i = 0; i < Cantidad; i ++)
    {
      System.out.println ("Valor " +  (i + 1) + ":");
      Arreglo [i] = scan.nextInt ();
    }
    objetoMedia.calcularMedia (Arreglo, Cantidad);
    System.out.println ("La media aritmética es = " + objetoMedia.getMedia ());
  }
}
