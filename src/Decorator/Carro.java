package Decorator;

public class Carro implements Veiculo {

    @Override
    public void mostrarDetalhes() {
        System.out.println("Veículo: Carro");
    }

    @Override
    public double calcularPreco() {
        return 50.0;  // Preço base do carro
    }
}