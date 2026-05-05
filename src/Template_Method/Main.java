package Template_Method;

public class Main {
    public static void main(String[] args) {

        GeradorDocumentoSUAP declaracao = new DeclaracaoMatricula();
        declaracao.gerarDocumento();

        System.out.println();

        GeradorDocumentoSUAP historico = new HistoricoEscolar();
        historico.gerarDocumento();

        System.out.println();

        GeradorDocumentoSUAP plano = new PlanoDisciplina();
        plano.gerarDocumento();
    }
}