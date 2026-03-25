package Facade.subsistemas;

import Facade.model.Cliente;
import Facade.Pedido;

public class NotificacaoService {
    public void enviarConfirmacao(Cliente cliente, Pedido pedido) {
        System.out.println("E-mail enviado para " + cliente.getEmail() +
                " com a confirmação do pedido " + pedido.getCodigo());
    }
}