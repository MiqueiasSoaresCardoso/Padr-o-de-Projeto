package Mediator;

/*A torre controla se a pista está disponível ou ocupada.*/
public class TorreControleAeroporto implements TorreControle {

    private boolean pistaDisponivel = true;

    @Override
    public void solicitarPouso(Aviao aviao) {
        if (pistaDisponivel) {
            System.out.println("Torre: " + aviao.getNome() + " autorizado para pouso.");
            pistaDisponivel = false;
        } else {
            System.out.println("Torre: " + aviao.getNome() + ", aguarde. Pista ocupada.");
        }
    }

    @Override
    public void liberarPista() {
        pistaDisponivel = true;
        System.out.println("Torre: pista liberada para novo pouso.");
    }
}
