package Facade.model;

public class Cliente {
    private final String nome;
    private final String email;
    private final boolean ativo;

    public Cliente(String nome, String email, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }
}