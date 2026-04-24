package State;

public class EstadoAtacando implements EstadoPersonagem {

    @Override
    public void atacar(Personagem p) {
        System.out.println("Já está atacando.");
    }

    @Override
    public void pular(Personagem p) {
        System.out.println("Não pode pular durante ataque.");
    }

    @Override
    public void receberDano(Personagem p) {
        System.out.println("Interrompido e ferido!");
        p.setEstado(new EstadoFerido());
    }

    @Override
    public void atualizar(Personagem p) {
        System.out.println("Ataque finalizado.");
        p.setEstado(new EstadoNormal());
    }
}