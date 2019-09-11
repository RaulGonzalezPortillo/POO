public class ClaseMediaFrecuencia
{
  double MediaFrecuencia;
  public void calcularMedia (int [] Arreglo, int Cantidad)
  {
    for (int i = 0; i < Cantidad; i ++)
    {
      Media += Arreglo [i];
    }
    Media /= Cantidad;
  }
  public double getMedia ()
  {
    return Media;
  }
}
