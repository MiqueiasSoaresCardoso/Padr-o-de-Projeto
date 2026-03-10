package Singleton;

public class BibliotecaService {
    public void imprimirRecibo(String aluno) {
        FilaImpressao.getInstance().adicionarDocumento("Recibo Biblioteca - " + aluno);
    }
}