package Bridge;

public class Main {
    public static void main(String[] args) {

        Relatorio r1 = new RelatorioFinanceiro(new ExportadorPDF());
        r1.gerar();

        Relatorio r2 = new RelatorioFinanceiro(new ExportadorExcel());
        r2.gerar();

        Relatorio r3 = new RelatorioAcademico(new ExportadorPDF());
        r3.gerar();
    }
}