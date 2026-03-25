package Facade;

import Facade.subsistemas.*;

public class Main_semfacade {
    public static void main(String[] args) {
        CarrinhoService carrinhoService = new CarrinhoService();
        ClienteService clienteService = new ClienteService();
        FreteService freteService = new FreteService();
        PagamentoService pagamentoService = new PagamentoService();
        EstoqueService estoqueService = new EstoqueService();
        PedidoService pedidoService = new PedidoService();
        NotaFiscalService notaFiscalService = new NotaFiscalService();
        NotificacaoService notificacaoService = new NotificacaoService();

// várias chamadas manuais, várias validações, várias dependências...
    }
}
