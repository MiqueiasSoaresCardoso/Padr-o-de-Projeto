package Singleton;

public class SecretariaService {
    public void imprimirDeclaracao(String aluno) {
        FilaImpressao.getInstance().adicionarDocumento("Declaração - " + aluno);
    }
}