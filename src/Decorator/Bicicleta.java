package Decorator;

public class Bicicleta implements Veiculo {

    @Override
    public void mostrarDetalhes() {
        System.out.println("Veículo: Bicicleta");
    }

    @Override
    public double calcularPreco() {
        return 15.0;  // Preço base da bicicleta
    }
}