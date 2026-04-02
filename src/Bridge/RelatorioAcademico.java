package Bridge;

//Relatório acadêmico é um tipo de relatório

/*
* */
public class RelatorioAcademico extends Relatorio {

    public RelatorioAcademico(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        exportador.exportar("Relatório Acadêmico");
    }
}
