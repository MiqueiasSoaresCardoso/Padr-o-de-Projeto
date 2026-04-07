package Strategy;

public class FreteNormal implements FreteStrategy {

    @Override
    public double calcular(double valorPedido) {
        return 20.0;
    }
}