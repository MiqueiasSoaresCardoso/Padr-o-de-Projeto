package Bridge;

public abstract class Relatorio {
    /*Aqui está a ponte, o relatório não sabe como exportar, então ele delega isso*/
    protected Exportador exportador;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
    }
    public abstract void gerar();
}