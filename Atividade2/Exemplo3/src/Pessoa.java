public class Pessoa implements Runnable{
    private final String nome;
    Banheiro banheiro;

    public Pessoa(String nome, Banheiro banheiro) {
        this.nome = nome;
        this.banheiro = banheiro;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        banheiro.usar(nome);
    }
}
