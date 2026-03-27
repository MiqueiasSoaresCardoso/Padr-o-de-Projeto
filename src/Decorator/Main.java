package Decorator;

public class Main {
    public static void main(String[] args) {

        // 1) Criando um carro básico e adicionando Ar-condicionado
        Veiculo carro = new Carro();
        System.out.println(carro.calcularPreco());
        carro.mostrarDetalhes();
        Veiculo carroComAr = new ArCondicionadoDecorator(carro);
        carroComAr.mostrarDetalhes();
        System.out.println("Preço: R$ " + carroComAr.calcularPreco());

        System.out.println();

        /*
        // 2) Criando uma moto com GPS e Wi-Fi
        Veiculo moto = new Moto();
        Veiculo motoComGpsEWifi = new WifiDecorator(new GpsDecorator(moto));
        motoComGpsEWifi.mostrarDetalhes();
        System.out.println("Preço: R$ " + motoComGpsEWifi.calcularPreco());
        */
        System.out.println();
        /*
        // 3) Criando uma bicicleta com Ar-condicionado, GPS e Wi-Fi
        Veiculo bicicleta = new Bicicleta();
        Veiculo bicicletaComExtras = new WifiDecorator(new GpsDecorator(new ArCondicionadoDecorator(bicicleta)));
        bicicletaComExtras.mostrarDetalhes();
        System.out.println("Preço: R$ " + bicicletaComExtras.calcularPreco());

         */
    }
}