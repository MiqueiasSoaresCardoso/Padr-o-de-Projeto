package Singleton;

public class Main {
    public static void main(String[] args) {
        SecretariaService secretaria = new SecretariaService();
        BibliotecaService biblioteca = new BibliotecaService();

        secretaria.imprimirDeclaracao("Ana");
        biblioteca.imprimirRecibo("Ana");
        secretaria.imprimirDeclaracao("Bruno");

        FilaImpressao fila1 = FilaImpressao.getInstance();
        FilaImpressao fila2 = FilaImpressao.getInstance();

        System.out.println("Mesma instância? " + (fila1 == fila2)); // true

        fila1.mostrarFila();
        fila2.imprimirProximo();
        fila2.imprimirProximo();
        fila2.imprimirProximo();
        fila2.imprimirProximo(); // fila vazia
    }
}