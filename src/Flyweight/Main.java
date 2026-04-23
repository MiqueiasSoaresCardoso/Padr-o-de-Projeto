package Flyweight;

public class Main {
    public static void main(String[] args) {

        /*"Criando" os Blocos*/
        Bloco pedra1 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        Bloco pedra2 = BlocoFactory.getBloco("Pedra", "pedra.png", true);
        Bloco grama = BlocoFactory.getBloco("Grama", "grama.png", true);

        pedra1.exibir(10, 64, 20);
        pedra1.exibir(12, 64, 20);
        pedra2.exibir(11, 64, 20);
        grama.exibir(12, 64, 20);

        System.out.println("pedra1 e pedra2 são o mesmo objeto? " + (pedra1 == pedra2));
    }
}