package Decorator;

public class Moto implements Veiculo {

    @Override
    public void mostrarDetalhes() {
        System.out.println("Veículo: Moto");
    }

    @Override
    public double calcularPreco() {
        return 30.0;  // Preço base da moto
    }
}
