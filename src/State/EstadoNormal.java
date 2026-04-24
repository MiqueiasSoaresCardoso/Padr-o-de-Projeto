package State;

public class EstadoNormal implements EstadoPersonagem {

    @Override
    public void atacar(Personagem p) {
        System.out.println("Personagem atacando!");
        p.setEstado(new EstadoAtacando());
    }

    @Override
    public void pular(Personagem p) {
        System.out.println("Personagem pulando!");
        p.setEstado(new EstadoPulando());
    }

    @Override
    public void receberDano(Personagem p) {
        System.out.println("Personagem ferido!");
        p.setEstado(new EstadoFerido());
    }

    @Override
    public void atualizar(Personagem p) {
        System.out.println("Personagem está em estado normal.");
    }
}