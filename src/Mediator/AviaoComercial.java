package Mediator;

/*O avião solicita pouso para a torre.
Ele não decide sozinho se pode pousar.*/

public class AviaoComercial extends Aviao {

    public AviaoComercial(TorreControle torre, String nome) {
        super(torre, nome);
    }

    @Override
    public void solicitarPouso() {
        System.out.println(nome + ": solicitando permissão para pouso.");
        torre.solicitarPouso(this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}