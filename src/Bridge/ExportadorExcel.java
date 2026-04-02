package Bridge;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando em Excel: " + conteudo);
    }
}