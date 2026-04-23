package ChainofResponsibility;

//APROVADOR NIVEL 01
public class Analista extends Aprovador {

    @Override
    public void aprovar(double valor) {
        if (valor <= 1000) {
            System.out.println("Analista aprovou: " + valor);
        } else if (proximo != null) {
            proximo.aprovar(valor);
        }
    }
}