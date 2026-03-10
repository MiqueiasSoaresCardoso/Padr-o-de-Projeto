package Singleton;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {

    private static final FilaImpressao INSTANCE = new FilaImpressao();
    private final Queue<String> fila = new LinkedList<>();

    private FilaImpressao() { }

    public static FilaImpressao getInstance() {
        return INSTANCE;
    }

    public void adicionarDocumento(String nomeDoc) {
        fila.add(nomeDoc);
        System.out.println("Adicionado na fila: " + nomeDoc);
    }

    public void imprimirProximo() {
        String doc = fila.poll();
        if (doc == null) {
            System.out.println("Fila vazia. Nada para imprimir.");
            return;
        }
        System.out.println("Imprimindo: " + doc);
    }

    public void mostrarFila() {
        System.out.println("Fila atual: " + fila);
    }
}