public class Main {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread t1 = new Thread(new Pessoa("Pessoa 1", banheiro));
        Thread t2 = new Thread(new Pessoa("Pessoa 2", banheiro));
        Thread t3 = new Thread(new Pessoa("Pessoa 3", banheiro));
        Thread t4 = new Thread(new Pessoa("Pessoa 4", banheiro));
        Thread t5 = new Thread(new Pessoa("Pessoa 5", banheiro));
        Thread t6 = new Thread(new Pessoa("Pessoa 6", banheiro));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}