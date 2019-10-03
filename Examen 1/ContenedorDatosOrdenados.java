import java.util.Scanner;

public class ContenedorDatosOrdenados
{
  static Scanner scan = new Scanner (System.in);
  public static void main(String[] args)
  {
    int i;
    System.out.println("Ingrese la cantidad de números a leer");
    int Cantidad = scan.nextInt();
    ClaseDatosOrdenados Datos = new ClaseDatosOrdenados();
    //int Arreglo [] = new int [Cantidad];
    /*System.out.println("Ingrese los siguientes valores");
    for (i = 0; i < Cantidad; i ++)
    {
      System.out.println ("Valor " +  (i + 1) + ":");
      Arreglo [i] = scan.nextInt ();
    }*/
    int[] Arreglo = {88, 45, 53, 86, 33, 86, 85, 30, 89, 53, 41, 96, 56, 38, 62, 71, 51, 86, 68, 29, 28, 47, 33, 37, 25, 36, 33, 94, 73, 46, 42, 34, 79, 72, 88, 99, 82, 62, 57, 42, 28, 55, 67, 62, 60, 96, 61, 57, 75, 93, 34, 75, 53, 32, 28, 73, 51, 69, 91, 35};
    int ArregloOrdenado [] = new int [Cantidad];
    ArregloOrdenado = Datos.Ordenar (Arreglo, Cantidad);
    System.out.println("¿Que percentil desea calcular?");
    int Percentil = scan.nextInt ();
    Datos.CalcularPercentil (ArregloOrdenado, Percentil);
    System.out.println("Hola");
    System.out.println("El resultado es: " + Datos.GetResultado());
  }
}
