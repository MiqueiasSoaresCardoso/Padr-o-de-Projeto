package Facade.subsistemas;

public class PagamentoService {
    public boolean processarPagamento(String metodoPagamento, double valor) {
        if (metodoPagamento == null || metodoPagamento.isBlank()) {
            throw new IllegalArgumentException("Método de pagamento inválido.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do pagamento inválido.");
        }

        System.out.println("Processando pagamento via " + metodoPagamento + " no valor de R$ " + valor);

        return true;
    }
}