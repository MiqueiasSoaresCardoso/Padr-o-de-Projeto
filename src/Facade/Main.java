package Facade;

import Facade.model.Carrinho;
import Facade.model.Cliente;
import Facade.model.ItemCarrinho;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemCarrinho item1 = new ItemCarrinho("Teclado Mecânico", 1, 250.0);
        ItemCarrinho item2 = new ItemCarrinho("Mouse Gamer", 2, 120.0);

        Carrinho carrinho = new Carrinho(List.of(item1, item2));

        Cliente cliente = new Cliente("Miquéias", "miqueias@ifpb.edu.br", true);

        CheckoutFacade checkoutFacade = new CheckoutFacade();

        Pedido pedido = checkoutFacade.finalizarCompra(carrinho, cliente,
                "PIX",
                "Rua Projetada, 123"
        );

        System.out.println("Pedido final: " + pedido.getCodigo() + " | Total: R$ " + pedido.getTotal());
    }
}
