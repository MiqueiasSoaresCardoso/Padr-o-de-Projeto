package Observer;

public class SmsService implements Observador {

    @Override
    public void atualizar(String status) {
        System.out.println("SMS enviado: Pedido agora está " + status);
    }
}
