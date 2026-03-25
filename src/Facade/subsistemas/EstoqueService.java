package Facade.subsistemas;

import Facade.model.Carrinho;
import Facade.model.ItemCarrinho;

public class EstoqueService {
    public void baixarEstoque(Carrinho carrinho) {
        for (ItemCarrinho item : carrinho.getItens()) {
            System.out.println("Baixando estoque: " + item.getQuantidade() + "x " + item.getNomeProduto());
        }
    }
}