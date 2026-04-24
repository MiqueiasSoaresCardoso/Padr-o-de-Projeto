package State;

public class EstadoPulando implements EstadoPersonagem {

    @Override
    public void atacar(Personagem p) {
        System.out.println("Não pode atacar enquanto pula.");
    }

    @Override
    public void pular(Personagem p) {
        System.out.println("Já está pulando.");
    }

    @Override
    public void receberDano(Personagem p) {
        System.out.println("Tomou dano no ar!");
        p.setEstado(new EstadoFerido());
    }

    @Override
    public void atualizar(Personagem p) {
        System.out.println("Personagem caiu.");
        p.setEstado(new EstadoNormal());
    }
}