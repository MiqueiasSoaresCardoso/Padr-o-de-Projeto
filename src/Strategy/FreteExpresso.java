package Strategy;

public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcular(double valorPedido) {
        return 40.0;
    }
}