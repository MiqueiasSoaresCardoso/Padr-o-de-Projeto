package ChainofResponsibility;

public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public abstract void aprovar(double valor);
}