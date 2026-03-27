package Composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ArquivoSistema {

    private final String nome;
    private final List<ArquivoSistema> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ArquivoSistema item) {
        itens.add(item);
    }

    public void remover(ArquivoSistema item) {
        itens.remove(item);
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ Pasta: " + nome);

        for (ArquivoSistema item : itens) {
            item.exibir(prefixo + "   ");
        }
    }
}