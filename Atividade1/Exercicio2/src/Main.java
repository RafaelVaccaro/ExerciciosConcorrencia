public class Main {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria cb = new ContaBancaria(1000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cb.depositar(200);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cb.sacar(200);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(cb.getSaldo());
    }
}