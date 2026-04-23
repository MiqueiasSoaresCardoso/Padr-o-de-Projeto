package ChainofResponsibility;

//APROVADOR NIVEL 03
public class Diretor extends Aprovador {

    @Override
    public void aprovar(double valor) {
        if (valor <= 20000) {
            System.out.println("Diretor aprovou: " + valor);
        } else {
            System.out.println("Valor muito alto, não aprovado.");
        }
    }
}
