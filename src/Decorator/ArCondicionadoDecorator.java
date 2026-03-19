package Decorator;

public class ArCondicionadoDecorator implements Veiculo {

    private final Veiculo veiculo;

    public ArCondicionadoDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void mostrarDetalhes() {
        veiculo.mostrarDetalhes();
        System.out.println("Com Ar-Condicionado");
    }

    @Override
    public double calcularPreco() {
        return veiculo.calcularPreco() + 10.0;  // Adiciona o preço do Ar-condicionado
    }
}