package Template_Method;

public class PlanoDisciplina extends GeradorDocumentoSUAP {

    @Override
    protected void buscarDados() {
        System.out.println("Buscando dados da disciplina, professor e ementa...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Organizando carga horária, objetivos e conteúdo programático...");
    }

    @Override
    protected void gerarConteudoEspecifico() {
        System.out.println("Gerando corpo do plano de disciplina...");
    }
}