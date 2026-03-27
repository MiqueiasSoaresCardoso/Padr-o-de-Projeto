package Proxy;

public class Main {
    public static void main(String[] args) {
        LancamentoNotas sistema = new LancamentoNotasProxy();

        sistema.lançarNota("Carlos", "PROFESSOR", "João", 8.5);
        sistema.lançarNota("Marina", "COORDENADOR", "Ana", 9.0);
        sistema.lançarNota("Pedro", "ALUNO", "Lucas", 10.0);
    }
}