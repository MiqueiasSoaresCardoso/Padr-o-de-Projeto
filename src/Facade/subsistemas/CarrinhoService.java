package Facade.subsistemas;

import Facade.model.Carrinho;
import Facade.model.ItemCarrinho;

public class CarrinhoService {
    public void validarCarrinho(Carrinho carrinho) {
        if (carrinho == null || carrinho.getItens() == null || carrinho.getItens().isEmpty()) {
            throw new IllegalArgumentException("Carrinho vazio.");
        }

        for (ItemCarrinho item : carrinho.getItens()) {
            if (item.getQuantidade() <= 0) {
                throw new IllegalArgumentException("Quantidade inválida para o produto: " + item.getNomeProduto());
            }
            if (item.getPrecoUnitario() <= 0) {
                throw new IllegalArgumentException("Preço inválido para o produto: " + item.getNomeProduto());
            }
        }

        System.out.println("Carrinho validado com sucesso.");
    }
}
