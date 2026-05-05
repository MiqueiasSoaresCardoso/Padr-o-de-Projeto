package Template_Method;

public class DeclaracaoMatricula extends GeradorDocumentoSUAP {

    @Override
    protected void buscarDados() {
        System.out.println("Buscando dados do aluno e da matrícula...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Verificando se a matrícula do aluno está ativa...");
    }

    @Override
    protected void gerarConteudoEspecifico() {
        System.out.println("Gerando texto da declaração de matrícula...");
    }
}