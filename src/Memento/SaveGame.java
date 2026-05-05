package Memento;

/* Essa classe guarda uma cópia do estado do jogo.
Ela representa o Memento.*/
public class SaveGame {

    private final int vida;
    private final int fase;
    private final String localizacao;

    public SaveGame(int vida, int fase, String localizacao) {
        this.vida = vida;
        this.fase = fase;
        this.localizacao = localizacao;
    }

    public int getVida() {
        return vida;
    }

    public int getFase() {
        return fase;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}