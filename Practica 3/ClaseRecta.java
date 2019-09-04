public class ClaseRecta {
  float m, b;
  public void calcularPendiente (float X1, float Y1, float X2, float Y2) {
    m = (Y2 - Y1) / (X2 - X1);
  }
  public float getPendiente () {
    return m;
  }
  public void calcularOrdenada (float X1, float Y1, float X2, float Y2) {
    b = Y1 - m * X1;
  }
  public float getOrdenada () {
    return b;
  }
  public void interseccion (float m2, float b2) {
    float x, y, Divisor;
    if (m == m2)
      System.out.println ("Las rectas son paralelas");
    else
    {
      Divisor = m - m2;
      x = (b2 - b) / Divisor;
      y = (m * x) + b;
      System.out.println ("Las rectas se intersectan en " + x + ", " + y);
    }
  }
  public double angulo (float m2) {
    return Math.toDegrees (Math.atan ((m2 - m) / (1 + (m2 * m))));
  }
}
