public class ClaseMediaFrecuencia
{
  double MediaFrecuencia;
  public void calcularMedia (int [] Arreglo, int Cantidad)
  {
    for (int i = 0; i < Cantidad; i ++)
    {
      MediaFrecuencia += Arreglo [i];
    }
    MediaFrecuencia /= Cantidad;
  }
  public double getMedia ()
  {
    return MediaFrecuencia;
  }
}
