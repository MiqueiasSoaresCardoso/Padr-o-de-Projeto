package Observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements PedidoSubject {

    private List<Observador> observadores = new ArrayList<>();
    private String status;

    @Override
    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }
    //Percorre toda a lista de observadores e chama o método atualizar(status) em cada um.
    @Override
    public void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(status);
        }
    }

    public void atualizarStatus(String novoStatus) {
        System.out.println("\nAtualizando status do pedido para: " + novoStatus);
        this.status = novoStatus;
        notificarObservadores();
    }

    public String getStatus() {
        return status;
    }
}
