public class Launchevent implements Runnable
{
  private int Tiempo;
  private String Color;
  public Launchevent(int Tiempo, String Color)
  {
    this.Tiempo = Tiempo;
    this.Color = Color;
  }
  public void run()
  {
    System.out.println("Estamos en " + Color);
    for(int t = Tiempo; t >= 0; t--)
    {
      System.out.println("Tiempo restante: " + t);
      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException E)
      {
        
      }
    }
  }
}
