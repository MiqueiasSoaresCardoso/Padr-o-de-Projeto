package Observer;

public interface PedidoSubject {
    void adicionarObservador(Observador obs);
    void removerObservador(Observador obs);
    void notificarObservadores();
}
