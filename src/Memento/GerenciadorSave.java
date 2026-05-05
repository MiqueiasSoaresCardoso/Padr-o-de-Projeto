package Memento;

import java.util.Stack;
/*Essa classe guarda os saves.Ela é o Caretaker.

Ela não precisa saber os detalhes internos do jogo.
Ela apenas armazena os mementos.*/

public class GerenciadorSave {

    private Stack<SaveGame> historico = new Stack<>();

    public void adicionarSave(SaveGame save) {
        historico.push(save);
    }

    public SaveGame ultimoSave() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }

        return null;
    }
}
