package Observer;

public class LogService implements Observador {

    @Override
    public void atualizar(String status) {
        System.out.println("Log registrado: novo status do pedido = " + status);
    }
}
