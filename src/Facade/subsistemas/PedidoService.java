package Facade.subsistemas;

import Facade.model.Carrinho;
import Facade.Pedido;
import Facade.model.ItemCarrinho;

import java.util.UUID;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PedidoService {
    public Pedido gerarPedido(Carrinho carrinho, double frete) {
        double subtotal = carrinho.getSubtotal();
        double total = subtotal + frete;
        String codigo = UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        List<ItemCarrinho> itensDoPedido = new ArrayList<>(carrinho.getItens());

        Pedido pedido = new Pedido(codigo, subtotal, frete, total, itensDoPedido);

        System.out.println("Pedido gerado com código: " + pedido.getCodigo());
        return pedido;
    }
}