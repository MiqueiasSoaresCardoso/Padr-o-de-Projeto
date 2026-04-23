package ChainofResponsibility;

public class Main {
    public static void main(String[] args) {

        Aprovador analista = new Analista();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        analista.setProximo(gerente);
        gerente.setProximo(diretor);

        analista.aprovar(800);
        analista.aprovar(3000);
        analista.aprovar(15000);
        analista.aprovar(50000);
    }
}