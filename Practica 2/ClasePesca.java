import javax.swing.JOptionPane;

public class ClasePesca {
  public int pecesPorPescador (int Pescadores, int Peces) {
    int PecesPorPescador = Peces / Pescadores;
    JOptionPane.showMessageDialog (null, "A cada pescador le corresponden: " + PecesPorPescador + " peces\n", "Peces por pescador", JOptionPane.INFORMATION_MESSAGE);
    return PecesPorPescador;
  }
  public int sobrantePecesPorPescador (int Pescadores, int Peces) {
    int Sobrante = Peces % Pescadores;
    JOptionPane.showMessageDialog (null, "Sobran: " + Sobrante + " peces\n", "Sobrante de peces por pescador", JOptionPane.INFORMATION_MESSAGE);
    return Sobrante;
  }
}
