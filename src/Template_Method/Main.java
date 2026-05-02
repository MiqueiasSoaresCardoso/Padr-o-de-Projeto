package Template_Method;

public class Main {
    public static void main(String[] args) {

        GeradorRelatorio financeiro = new RelatorioFinanceiro();
        financeiro.gerarRelatorio();

        System.out.println();

        GeradorRelatorio academico = new RelatorioAcademico();
        academico.gerarRelatorio();
    }
}