package State;

public class EstadoFerido implements EstadoPersonagem {

    @Override
    public void atacar(Personagem p) {
        System.out.println("Não pode atacar enquanto está ferido.");
    }

    @Override
    public void pular(Personagem p) {
        System.out.println("Não pode pular enquanto está ferido.");
    }

    @Override
    public void receberDano(Personagem p) {
        System.out.println("Recebeu dano crítico. Personagem morreu.");
        p.setEstado(new EstadoMorto());
    }

    @Override
    public void atualizar(Personagem p) {
        System.out.println("Personagem se recuperou.");
        p.setEstado(new EstadoNormal());
    }
}