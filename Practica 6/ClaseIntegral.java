public class ClaseIntegral
{
  double Integral;
  public void calcularIntegral (double Δx)
  {
    for (double x = -1; x <= 2; x += Δx)
    {
      //Integral += (Δx * (Math.pow (x, 2) + 1));
      //Integral += (Δx * (x));
      Integral += (Δx * (Math.pow (x, 4) + 2));
    }
  }
  public double getIntegral ()
  {
    return Integral;
  }
}
