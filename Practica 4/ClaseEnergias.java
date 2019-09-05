public class ClaseEnergias
{
  static final double g = 9.81;
  double m, lectorm, cinetica, potencial;
  public ClaseEnergias (double lectorm)
  {
    m = lectorm;
  }
  public void calcularCinetica (float v)
  {
    cinetica = 0.5*(m)*(Math.pow (v, 2));
  }
  public double getCinetica ()
  {
    return cinetica;
  }
  public void calcularPotencial (float h)
  {
    potencial = m*g*h;
  }
  public double getPotencial ()
  {
    return potencial;
  }
}
