package Strategy;

public class Pedido {

    private double valor;
    private FreteStrategy estrategiaFrete;

    public Pedido(double valor, FreteStrategy estrategiaFrete) {
        this.valor = valor;
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularTotal() {
        return valor + estrategiaFrete.calcular(valor);
    }
}