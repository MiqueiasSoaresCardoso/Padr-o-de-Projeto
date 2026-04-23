package Observer;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Observador email = new EmailService();
        Observador sms = new SmsService();
        Observador log = new LogService();
        Observador dashboard = new DashboardService();

        pedido.adicionarObservador(email);
        pedido.adicionarObservador(sms);
        pedido.adicionarObservador(log);
        pedido.adicionarObservador(dashboard);

        pedido.atualizarStatus("EM PROCESSAMENTO");
        pedido.atualizarStatus("ENVIADO");
        pedido.atualizarStatus("ENTREGUE");
    }
}
