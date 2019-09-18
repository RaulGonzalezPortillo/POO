public class ClaseDado
{
  int Resultado;
  int Aciertos = 0;
  int Intentos = 0;
  String CadenaAciertos, CadenaIntentos;
  public void Lanzar (int Rango, int Minimo)
  {
    Resultado = (int)(Math.random() * Rango) + Minimo;
  }
  public int getResultado ()
  {
    return Resultado;
  }
  public void Comparar (int Intento)
  {
    Intentos++;
    if (Resultado == Intento)
    {
      Aciertos++;
      System.out.println ("Acertó!");
    }
    else
    {
      System.out.println ("El número correcto era " + Integer.toString(Resultado));
    }
  }
  public String getCadenaAciertos ()
  {
    CadenaAciertos = Integer.toString(Aciertos);
    return CadenaAciertos;
  }
  public String getCadenaIntentos ()
  {
    CadenaIntentos = Integer.toString(Intentos);
    return CadenaIntentos;
  }
}
