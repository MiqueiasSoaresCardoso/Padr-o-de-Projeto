package Observer;

public class DashboardService implements Observador {

    @Override
    public void atualizar(String status) {
        System.out.println("Dashboard atualizado: exibindo status " + status);
    }
}
