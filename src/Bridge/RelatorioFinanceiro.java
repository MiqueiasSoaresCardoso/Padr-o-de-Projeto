package Bridge;

//Relatório finânceiro é um tipo de relatório
public class RelatorioFinanceiro extends Relatorio {

    public RelatorioFinanceiro(Exportador exportador) {
        //Essa linha chama o construtor da classe Pai "relatório"
        super(exportador);
    }

    @Override
    public void gerar() {
        exportador.exportar("Relatório Financeiro");
    }
}