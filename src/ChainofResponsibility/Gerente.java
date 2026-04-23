package ChainofResponsibility;

//APROVADOR NIVEL 02

public class Gerente extends Aprovador {

    @Override
    public void aprovar(double valor) {
        if (valor <= 5000) {
            System.out.println("Gerente aprovou: " + valor);
        } else if (proximo != null) {
            proximo.aprovar(valor);
        }
    }
}
