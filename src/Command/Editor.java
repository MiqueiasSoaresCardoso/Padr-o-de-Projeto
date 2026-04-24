package Command;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Editor {

    //STACK --> PILHA --> LIFO (O ÚLTIMO A ENTRAR, É O PRIMEIRO A SAIR (SER DESFEITO))
    private Stack<Command> historico = new Stack<>();
    //LINKEDLIST --> LISTA ENCADEADA --> FIFO (O PRIMEIRO COMANDO QUE ENTROU SERÁ O PRIMEIRO A SER EXECUTADO)
    private Queue<Command> fila = new LinkedList<>();

    public void executarComando(Command command) {
        command.execute();
        historico.push(command);
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Command ultimo = historico.pop();
            ultimo.undo();
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void adicionarNaFila(Command command) {
        fila.add(command);
        System.out.println("Comando adicionado na fila.");
    }

    public void processarFila() {
        while (!fila.isEmpty()) {
            Command command = fila.poll(); //Pega e remove o primeiro comando da fila
            command.execute();
            historico.push(command);
        }
    }
}