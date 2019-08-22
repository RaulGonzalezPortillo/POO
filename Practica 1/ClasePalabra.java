
public class ClasePalabra {
  public void tamanoPalabra(String PalabraRecibida) {
    int Longitud = PalabraRecibida.length();
    System.out.println("El tamaño de la palabra es: " + Longitud);
  }
  public void ultimoCaracter(String PalabraRecibida) {
    int Longitud = PalabraRecibida.length();
    char UltimaLetra = PalabraRecibida.charAt(Longitud - 1);
    System.out.println("La ultima letra de la palabra es: " + UltimaLetra);
  }
  public void letraA(String PalabraRecibida) {
    boolean Contiene = PalabraRecibida.contains("a");
    System.out.println("¿Contiene la letra 'a'?: " + Contiene);
  }
}
