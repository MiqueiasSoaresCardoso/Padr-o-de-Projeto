package Visitor;

public class RelatorioVisitante implements Visitante {

    @Override
    public void visitarAluno(Aluno aluno) {
        System.out.println("Relatório do aluno: "
                + aluno.getNome()
                + " | Matrícula: "
                + aluno.getMatricula());
    }

    @Override
    public void visitarProfessor(Professor professor) {
        System.out.println("Relatório do professor: "
                + professor.getNome()
                + " | Disciplina: "
                + professor.getDisciplina());
    }
}