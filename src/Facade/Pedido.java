package Facade;
import Facade.model.ItemCarrinho;

import java.util.List;

public class Pedido {
    private final String codigo;
    private final double subtotal;
    private final double frete;
    private final double total;
    private final List<ItemCarrinho> itens;

    public Pedido(String codigo, double subtotal, double frete, double total, List<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.frete = frete;
        this.total = total;
        this.itens = itens;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getFrete() {
        return frete;
    }

    public double getTotal() {
        return total;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }
}
