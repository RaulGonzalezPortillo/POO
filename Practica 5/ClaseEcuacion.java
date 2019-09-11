public class ClaseEcuacion
{
  public void puntosCorte (double a, double b, double c)
  {
    double x1, x2, raiz = (Math.pow (b, 2)) - (4*a*c);
    System.out.println (raiz);
    if (raiz >= 0)
    {
      x1 = (-b + Math.sqrt (raiz)) / (2*a);
      System.out.println ("El primer punto de intersección con X es " + x1);
      x2 = (-b - Math.sqrt (raiz)) / (2*a);
      System.out.println ("El segundo punto de intersección con X es " + x2);
    }
    else
    {
      System.out.println ("No se pudo encontrar los puntos de intersección");
    }
  }
  public void puntosVertice (double a, double b, double c)
  {
    double x = - ((b) / (2*a));
    double y = a*(Math.pow (x, 2)) + b*(x) + c;
    System.out.println ("El punto vertice es " + x + ", " + y);
  }
  public void convexidad (double a)
  {
    if (a > 0)
    {
      System.out.println ("Cóncava hacia arriba");
    }
    if (a < 0)
    {
      System.out.println ("La ecuación es Convexa hacia abajo");
    }
  }
}
