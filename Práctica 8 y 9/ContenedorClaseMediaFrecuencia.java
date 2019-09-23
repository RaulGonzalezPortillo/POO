import java.util.Scanner;

public class ContenedorClaseMediaFrecuencia
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    int Lector, Temp, i;
    System.out.println ("Ingrese la cantidad de números a leer");
    int Cantidad = scan.nextInt ();
    ClaseMediaFrecuencia objetoMedia = new ClaseMediaFrecuencia ();
    int Arreglo [] = new int [Cantidad];
    int Arreglo2 [] = new int [Cantidad];
    int Frecuencias [] = new int [Cantidad];
    System.out.println ("Ingrese los siguientes valores");
    for (i = 0; i < Cantidad; i ++)
    {
      System.out.println ("Valor " +  (i + 1) + ":");
      Arreglo [i] = scan.nextInt ();
    }
    Arreglo = objetoMedia.Ordenar (Arreglo, Cantidad);
    objetoMedia.Conversion (Arreglo, Cantidad);
    Arreglo2 = objetoMedia.getArreglo2 ();
    Frecuencias = objetoMedia.getFrecuencias ();
    objetoMedia.imprimirTabla (Arreglo2, Frecuencias);
    objetoMedia.calcularMediaFrecuencia (Arreglo2, Cantidad);
    System.out.println ("La media aritmética es = " + objetoMedia.getMediaFrecuencia ());
    objetoMedia.calcularMediana (Arreglo, Cantidad);
    System.out.println ("La mediana es = " + objetoMedia.getMediana ());
  }
}
