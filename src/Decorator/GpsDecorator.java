package Decorator;

public class GpsDecorator implements Veiculo {

    private final Veiculo veiculo;

    public GpsDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void mostrarDetalhes() {
        veiculo.mostrarDetalhes();
        System.out.println("Com GPS");
    }

    @Override
    public double calcularPreco() {
        return veiculo.calcularPreco() + 15.0;  // Adiciona o preço do GPS
    }
}