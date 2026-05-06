package Visitor;

public class Aluno implements Pessoa {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarAluno(this);
    }
}
