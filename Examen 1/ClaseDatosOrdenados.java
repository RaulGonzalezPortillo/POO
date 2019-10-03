public class ClaseDatosOrdenados
{
  double Resultado;
  int i, j, Temp;
  public int [] Ordenar (int [] Arreglo, int Cantidad)
  {
    for (i = 0; i < Cantidad - 1; i++)
    {
      for (j = 0; j < (Cantidad - i - 1); j++)
      {
        if (Arreglo [j] > Arreglo [j + 1])
        {
          Temp = Arreglo [j];
          Arreglo [j] = Arreglo [j + 1];
          Arreglo [j + 1] = Temp;
        }
      }
    }
    return Arreglo;
  }
  public void CalcularPercentil (int [] Arreglo, int Percentil)
  {
    double Posicion;
    int Cantidad = Arreglo.length;
    Posicion = (Cantidad * Percentil) / 100;
    if (Posicion % (int)Posicion == 0)
    {
      System.out.println("if");

      Resultado = Arreglo [(int)Posicion - 1] + Arreglo [(int)Posicion];
      Resultado /= 2;
    }
    else
    {
      System.out.println("else");

      Posicion = Math.ceil(Posicion);
      Resultado = Arreglo[(int)Posicion];
    }
  }
  public double GetResultado ()
  {
    return Resultado;
  }
}
