package Memento;

public class Main {
    public static void main(String[] args) {

        Jogo jogo = new Jogo(100, 1, "Vila inicial");
        GerenciadorSave gerenciador = new GerenciadorSave();

        System.out.println("=== Estado inicial ===");
        jogo.mostrarEstado();

        gerenciador.adicionarSave(jogo.salvar());

        System.out.println("\n=== Jogador entra na floresta ===");
        jogo.jogar(20, "Floresta sombria");

        gerenciador.adicionarSave(jogo.salvar());

        System.out.println("\n=== Jogador enfrenta chefe ===");
        jogo.jogar(60, "Castelo do chefe");

        System.out.println("\n=== Jogador perdeu muita vida. Restaurando último save ===");
        SaveGame save = gerenciador.ultimoSave();

        if (save != null) {
            jogo.restaurar(save);
        }
    }
}