package Proxy;

public class LancamentoNotasReal implements LancamentoNotas {

    @Override
    public void lançarNota(String usuario, String perfil, String aluno, double nota) {
        System.out.println("Nota " + nota + " lançada para o aluno " + aluno + " por " + usuario + ".");
    }
}
