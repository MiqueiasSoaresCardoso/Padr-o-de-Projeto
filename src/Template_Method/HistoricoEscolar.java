package Template_Method;

public class HistoricoEscolar extends GeradorDocumentoSUAP {

    @Override
    protected void buscarDados() {
        System.out.println("Buscando disciplinas, notas e cargas horárias do aluno...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Calculando médias, aprovações e situação acadêmica...");
    }

    @Override
    protected void gerarConteudoEspecifico() {
        System.out.println("Gerando tabela do histórico escolar...");
    }
}