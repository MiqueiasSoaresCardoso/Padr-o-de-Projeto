package State;

public class Personagem {

    private EstadoPersonagem estado;

    public Personagem() {
        this.estado = new EstadoNormal();
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estado = estado;
    }

    public void atacar() {
        estado.atacar(this);
    }

    public void pular() {
        estado.pular(this);
    }

    public void receberDano() {
        estado.receberDano(this);
    }

    public void atualizar() {
        estado.atualizar(this);
    }
}
