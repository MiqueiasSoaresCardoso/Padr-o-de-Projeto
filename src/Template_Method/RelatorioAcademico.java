package Template_Method;

public class RelatorioAcademico extends GeradorRelatorio {

    @Override
    protected void buscarDados() {
        System.out.println("Buscando dados de alunos, notas e frequências...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Calculando médias e situações dos alunos...");
    }
}