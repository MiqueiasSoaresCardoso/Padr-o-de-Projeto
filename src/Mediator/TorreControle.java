package Mediator;

/*Essa interface define as operações que os aviões podem solicitar a torre*/
public interface TorreControle {
    void solicitarPouso(Aviao aviao);
    void liberarPista();
}
