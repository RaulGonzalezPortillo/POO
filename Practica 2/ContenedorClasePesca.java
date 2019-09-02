import javax.swing.JOptionPane;

public class ContenedorClasePesca {
  public static void main (String[] args) {
    ClasePesca objetoPesca = new ClasePesca ();
    String EntradaPescadores;
    String EntradaPeces;
    int i;
    EntradaPescadores = JOptionPane.showInputDialog ("Ingresa el número de pescadores");
    int Pescadores = Integer.parseInt (EntradaPescadores);
    EntradaPeces = JOptionPane.showInputDialog ("Ingresa el número de peces");
    int Peces = Integer.parseInt (EntradaPeces);
    objetoPesca.pecesPorPescador (Pescadores, Peces);
    objetoPesca.sobrantePecesPorPescador (Pescadores, Peces);
  }
}
