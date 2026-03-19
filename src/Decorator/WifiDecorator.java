package Decorator;

public class WifiDecorator implements Veiculo {

    private final Veiculo veiculo;

    public WifiDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void mostrarDetalhes() {
        veiculo.mostrarDetalhes();
        System.out.println("Com Wi-Fi");
    }

    @Override
    public double calcularPreco() {
        return veiculo.calcularPreco() + 20.0;  // Adiciona o preço do Wi-Fi
    }
}
