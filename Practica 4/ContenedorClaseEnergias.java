import java.util.Scanner;

public class ContenedorClaseEnergias
{
  static Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    System.out.println ("Ingresa el valor de la masa de tu objeto en kg: ");
    float m = scan.nextFloat ();
    System.out.println ("Ingresa el valor de la velocidad de tu objeto en m/s: ");
    float v = scan.nextFloat ();
    System.out.println ("Ingresa el valor de la altura de tu objeto en m: ");
    float h = scan.nextFloat ();
    ClaseEnergias objetoEnergias1 = new ClaseEnergias (m);
    objetoEnergias1.calcularCinetica (v);
    System.out.println ("La energía cinética de tu objeto es: " + objetoEnergias1.getCinetica () + "J");
    objetoEnergias1.calcularPotencial (h);
    System.out.println ("La energía potencial de tu objeto es: " + objetoEnergias1.getPotencial () + "J");
  }
}
