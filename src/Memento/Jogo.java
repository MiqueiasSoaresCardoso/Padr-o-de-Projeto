package Memento;

/*Essa é a classe principal do jogo. Ela é o Originator, porque:

possui o estado real
sabe salvar seu estado
sabe restaurar seu estado*/

public class Jogo {

    private int vida;
    private int fase;
    private String localizacao;

    public Jogo(int vida, int fase, String localizacao) {
        this.vida = vida;
        this.fase = fase;
        this.localizacao = localizacao;
    }

    public void jogar(int dano, String novaLocalizacao) {
        this.vida -= dano;
        this.localizacao = novaLocalizacao;

        System.out.println("Jogando...");
        mostrarEstado();
    }

    public void avancarFase() {
        this.fase++;
        this.localizacao = "Início da fase " + fase;

        System.out.println("Avançou de fase!");
        mostrarEstado();
    }

    public SaveGame salvar() {
        System.out.println("Jogo salvo.");
        return new SaveGame(vida, fase, localizacao);
    }

    public void restaurar(SaveGame save) {
        this.vida = save.getVida();
        this.fase = save.getFase();
        this.localizacao = save.getLocalizacao();

        System.out.println("Jogo restaurado.");
        mostrarEstado();
    }

    public void mostrarEstado() {
        System.out.println("Vida: " + vida + " | Fase: " + fase + " | Localização: " + localizacao);
    }
}