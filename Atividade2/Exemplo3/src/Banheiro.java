import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Banheiro {

    Semaphore semaforo = new Semaphore(3);
    Random random = new Random();

    public void usar(String nome) {
        try {
            System.out.println(nome + " quer usar o banheiro");
            if (!semaforo.tryAcquire(2000, TimeUnit.MILLISECONDS)) {
                System.out.println(nome + " desistiu de usar o banheior");
            } else {
                semaforo.acquire();
                System.out.println(nome + " conseguiu usar o banheiro");
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(nome + " terminou de usar o banheiro");
            semaforo.release();
        }
    }
}
