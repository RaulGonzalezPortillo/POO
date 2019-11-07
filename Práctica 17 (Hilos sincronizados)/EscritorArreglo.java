import java.lang.Runnable;

public class EscritorArreglo implements Runnable
{
  private final ArregloSimple arregloSimpleCompartido;
  private final int valorInicial, limite;

  public EscritorArreglo(int valor, ArregloSimple arreglo, int constructorLimite)
  {
    limite = constructorLimite;
    valorInicial = valor;
    arregloSimpleCompartido = arreglo;
  }

  public void run()
  {
    for(int i = valorInicial; i < valorInicial + limite; i++)
    {
      arregloSimpleCompartido.agregar(i);
    }
  }
}
