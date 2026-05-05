package Mediator;

/*O avião conhece apenas a torre.
Ele não conhece os outros aviões.*/
public abstract class Aviao {

    protected TorreControle torre;
    protected String nome;

    public Aviao(TorreControle torre, String nome) {
        this.torre = torre;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void solicitarPouso();

    public abstract void receberMensagem(String mensagem);
}