package Mediator;

public class Main {
    public static void main(String[] args) {

        TorreControle torre = new TorreControleAeroporto();

        Aviao aviao1 = new AviaoComercial(torre, "Avião 101");
        Aviao aviao2 = new AviaoComercial(torre, "Avião 202");
        Aviao aviao3 = new AviaoComercial(torre, "Avião 303");

        aviao1.solicitarPouso();
        aviao2.solicitarPouso();

        torre.liberarPista();

        aviao3.solicitarPouso();
    }
}