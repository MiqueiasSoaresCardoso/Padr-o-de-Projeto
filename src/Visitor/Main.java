package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("João", "2024001"));
        pessoas.add(new Professor("Maria", "Banco de Dados"));
        pessoas.add(new Aluno("Ana", "2024002"));

        Visitante relatorio = new RelatorioVisitante();

        for (Pessoa pessoa : pessoas) {
            pessoa.aceitar(relatorio);
        }
    }
}