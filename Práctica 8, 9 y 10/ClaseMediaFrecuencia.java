public class ClaseMediaFrecuencia
{
  double MediaFrecuencia, Mediana;
  int [] Arreglo2, Frecuencias;
  int i, j, Temp, CantidadDividida;
  boolean Par;
  public int [] Ordenar (int [] Arreglo, int Cantidad)
  {
    for (i = 0; i < Cantidad - 1; i ++)
    {
      for (j = 0; j < (Cantidad - i - 1); j ++)
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
  public void Conversion (int [] Arreglo, int Cantidad)
  {
    Arreglo2 = new int [Cantidad + 1];
    Frecuencias = new int [Cantidad];
    Arreglo2 [0] = Arreglo [0];
    Frecuencias [0] = 1;
    j = 0;
    for (i = 1; i < Cantidad; i ++)
    {
      if (Arreglo [i] != Arreglo [i - 1])
      {
        j ++;
        Arreglo2 [j] = Arreglo [i];
        Frecuencias [j] = 1;
      }
      else
      {
        (Frecuencias [j]) ++;
      }
    }
    Arreglo2 [i] = 0;
  }
  public int [] getArreglo2 ()
  {
    return Arreglo2;
  }
  public int [] getFrecuencias ()
  {
    return Frecuencias;
  }
  public void imprimirTabla (int [] Arreglo2, int [] Frecuencias)
  {
    System.out.println ("Tabla de frecuencias:");
    for (i = 0; Arreglo2 [i] != 0 ; i ++)
    {
      System.out.println (Arreglo2 [i] + " " + Frecuencias [i]);
    }
  }
  public void calcularMediaFrecuencia (int [] Arreglo2, int Cantidad)
  {
    for (i = 0; Arreglo2[i] != 0; i ++)
    {
      MediaFrecuencia += (Arreglo2 [i] * Frecuencias [i]);
    }
    MediaFrecuencia /= Cantidad;
  }
  public double getMediaFrecuencia ()
  {
    return MediaFrecuencia;
  }
  public void calcularMediana (int [] Arreglo, int Cantidad)
  {
    if (Cantidad % 2 == 0)
    {
      Par = true;
    }
    CantidadDividida = Cantidad / 2;
    if (Par)
    {
      Mediana = (Arreglo [CantidadDividida - 1]) + (Arreglo [CantidadDividida]);
      Mediana = (double) Mediana / 2;
    }
    else
    {
      Mediana = Arreglo [CantidadDividida];
    }
  }
  public double getMediana ()
  {
    return Mediana;
  }
}
