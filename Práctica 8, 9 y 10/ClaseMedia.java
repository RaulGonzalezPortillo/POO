public class ClaseMedia
{
  double Media;
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
