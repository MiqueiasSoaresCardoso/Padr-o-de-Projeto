package Template_Method;

public abstract class GeradorDocumentoSUAP {

    /* Esse método define a ordem fixa do processo.Todo documento gerado seguirá essa sequência.
As subclasses não podem mudar essa ordem porque o método é final.*/

    public final void gerarDocumento() {
        buscarDados();
        processarDados();
        gerarConteudoEspecifico();
        adicionarCabecalhoInstitucional();
        adicionarRodape();
        exportarPDF();
    }

    protected abstract void buscarDados();

    protected abstract void processarDados();

    protected abstract void gerarConteudoEspecifico();

    protected void adicionarCabecalhoInstitucional() {
        System.out.println("Adicionando cabeçalho institucional do IFPB...");
    }

    protected void adicionarRodape() {
        System.out.println("Adicionando rodapé com data de emissão e assinatura...");
    }

    protected void exportarPDF() {
        System.out.println("Exportando documento em PDF...");
    }
}