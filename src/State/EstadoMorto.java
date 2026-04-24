package State;

public class EstadoMorto implements EstadoPersonagem {

    @Override
    public void atacar(Personagem p) {
        System.out.println("Personagem está morto.");
    }

    @Override
    public void pular(Personagem p) {
        System.out.println("Personagem está morto.");
    }

    @Override
    public void receberDano(Personagem p) {
        System.out.println("Já está morto.");
    }

    @Override
    public void atualizar(Personagem p) {
        System.out.println("Game Over.");
    }
}