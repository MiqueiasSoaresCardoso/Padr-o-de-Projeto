package Facade.subsistemas;

import Facade.model.Cliente;
import Facade.Pedido;

public class NotaFiscalService {
    public void emitirNota(Pedido pedido, Cliente cliente) {
        System.out.println("Nota fiscal emitida para o pedido " + pedido.getCodigo() +
                " em nome de " + cliente.getNome());
    }
}
