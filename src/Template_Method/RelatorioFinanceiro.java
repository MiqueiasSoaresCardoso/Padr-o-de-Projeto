package Template_Method;

public class RelatorioFinanceiro extends GeradorRelatorio {

    @Override
    protected void buscarDados() {
        System.out.println("Buscando dados financeiros...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Calculando receitas, despesas e saldo...");
    }
}