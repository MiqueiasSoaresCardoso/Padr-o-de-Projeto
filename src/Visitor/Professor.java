package Visitor;

public class Professor implements Pessoa {

    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarProfessor(this);
    }
}