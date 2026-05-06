package Visitor;

//Essa interface define quais tipos de objetos o visitante consegue visitar.
public interface Visitante {
    void visitarAluno(Aluno aluno);
    void visitarProfessor(Professor professor);
}