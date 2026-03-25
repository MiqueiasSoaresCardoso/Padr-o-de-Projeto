package Facade.subsistemas;

import Facade.model.Carrinho;

public class FreteService {
    public double calcularFrete(Carrinho carrinho, String enderecoEntrega) {
        if (enderecoEntrega == null || enderecoEntrega.isBlank()) {
            throw new IllegalArgumentException("Endereço de entrega inválido.");
        }

        double subtotal = carrinho.getSubtotal();
        /*Se o subtotal for maior que 100, o frete será R$ 10,00, caso contrário, o frete será R$ 20,00,
        estamos usando um operador ternário (forma curta e direta de aplicar o if/else)
         */
        double frete = subtotal > 100 ? 10.0 : 20.0;

        System.out.println("Frete calculado: R$ " + frete);
        return frete;
    }
}
