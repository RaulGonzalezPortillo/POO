import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class PruebaArregloCompartido
{
  public static void main(String[] arg)
  {
    ArregloSimple arregloSimpleCompartidoM = new ArregloSimple(8);
    EscritorArreglo escritor1 = new EscritorArreglo(5, arregloSimpleCompartidoM, 4);
    EscritorArreglo escritor2 = new EscritorArreglo(10, arregloSimpleCompartidoM, 3);
    EscritorArreglo escritor3 = new EscritorArreglo(20, arregloSimpleCompartidoM, 1);
    ExecutorService ejecutor = Executors.newCachedThreadPool();
    ejecutor.execute(escritor1);
    ejecutor.execute(escritor2);
    ejecutor.execute(escritor3);

    ejecutor.shutdown();
    try
    {
      boolean tareasTerminaron = ejecutor.awaitTermination(1, TimeUnit.MINUTES);

      if(tareasTerminaron)
        System.out.println(arregloSimpleCompartidoM);
      else
        System.out.println("Se agotó el tiempo esperando a que las tareas terminaran.");
    }
    catch(InterruptedException ex)
    {
      System.out.println("Hubo una interrupción mientras esperaba a que terminaran las tareas.");
    }
  }
}
