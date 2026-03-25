package Facade;

import Facade.model.Carrinho;
import Facade.model.Cliente;
import Facade.subsistemas.*;

public class CheckoutFacade {

    private final CarrinhoService carrinhoService;
    private final ClienteService clienteService;
    private final FreteService freteService;
    private final PagamentoService pagamentoService;
    private final EstoqueService estoqueService;
    private final PedidoService pedidoService;
    private final NotaFiscalService notaFiscalService;
    private final NotificacaoService notificacaoService;

    public CheckoutFacade() {
        this.carrinhoService = new CarrinhoService();
        this.clienteService = new ClienteService();
        this.freteService = new FreteService();
        this.pagamentoService = new PagamentoService();
        this.estoqueService = new EstoqueService();
        this.pedidoService = new PedidoService();
        this.notaFiscalService = new NotaFiscalService();
        this.notificacaoService = new NotificacaoService();
    }

    public Pedido finalizarCompra(Carrinho carrinho, Cliente cliente, String metodoPagamento, String enderecoEntrega) {
        System.out.println("=== INICIANDO CHECKOUT ===");

        carrinhoService.validarCarrinho(carrinho);
        clienteService.validarCliente(cliente);

        double frete = freteService.calcularFrete(carrinho, enderecoEntrega);
        double total = carrinho.getSubtotal() + frete;

        boolean pagamentoAprovado = pagamentoService.processarPagamento(metodoPagamento, total);

        if (!pagamentoAprovado) {
            throw new IllegalStateException("Pagamento não aprovado.");
        }

        estoqueService.baixarEstoque(carrinho);

        Pedido pedido = pedidoService.gerarPedido(carrinho, frete);

        notaFiscalService.emitirNota(pedido, cliente);
        notificacaoService.enviarConfirmacao(cliente, pedido);

        System.out.println("=== CHECKOUT FINALIZADO COM SUCESSO ===");

        return pedido;
    }
}
