import java.util.Scanner;

public class ContenedorClasePalabra {
  static Scanner scan = new Scanner(System.in);
  public static void main (String[] args) {
    ClasePalabra objetoPalabra = new ClasePalabra();
    System.out.println("Ingresa una palabra");
    String Palabra = scan.nextLine();
    System.out.println("Se recibió la palabra: " + Palabra);
    objetoPalabra.tamanoPalabra(Palabra);
    objetoPalabra.ultimoCaracter(Palabra);
    objetoPalabra.letraA(Palabra);
  }
}
