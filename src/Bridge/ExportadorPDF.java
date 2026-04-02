package Bridge;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando em PDF: " + conteudo);
    }
}
