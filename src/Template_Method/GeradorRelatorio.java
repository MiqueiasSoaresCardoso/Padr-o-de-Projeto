package Template_Method;

public abstract class GeradorRelatorio {

    public final void gerarRelatorio() {
        buscarDados();
        processarDados();
        gerarConteudo();
        exportar();
    }

    protected abstract void buscarDados();

    protected abstract void processarDados();

    protected void gerarConteudo() {
        System.out.println("Gerando conteúdo do relatório...");
    }

    protected void exportar() {
        System.out.println("Exportando relatório em PDF...");
    }
}