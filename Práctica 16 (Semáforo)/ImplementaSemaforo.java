public class ImplementaSemaforo
{
  public static void main (String[] args)
  {
    Launchevent Verde = new Launchevent (20, "Verde");
    Launchevent Amarillo = new Launchevent (5, "Amarillo");
    Launchevent Rojo = new Launchevent (5, "Rojo");
    Verde.run();
    Amarillo.run();
    Rojo.run();
  }
}
