package Proxy;

public class LancamentoNotasProxy implements LancamentoNotas {

    private final LancamentoNotasReal servicoReal;

    public LancamentoNotasProxy() {
        this.servicoReal = new LancamentoNotasReal();
    }

    @Override
    public void lançarNota(String usuario, String perfil, String aluno, double nota) {
        if (perfil.equalsIgnoreCase("PROFESSOR") || perfil.equalsIgnoreCase("COORDENADOR")) {
            System.out.println("Acesso autorizado para " + usuario + " (" + perfil + ")");
            servicoReal.lançarNota(usuario, perfil, aluno, nota);
        } else {
            System.out.println("Acesso negado para " + usuario + " (" + perfil + ")");
        }
    }
}