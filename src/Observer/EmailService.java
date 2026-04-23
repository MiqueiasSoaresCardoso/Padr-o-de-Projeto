package Observer;

public class EmailService implements Observador {

    @Override
    public void atualizar(String status) {
        System.out.println("Email enviado: Pedido agora está " + status);
    }
}