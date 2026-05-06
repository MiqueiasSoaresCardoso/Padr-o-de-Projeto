package Interpreter;

//Essa classe representa o comando SALDO, Quando interpretado, ele executa a ação de consultar saldo.
public class ConsultarSaldo implements ComandoBancario {

    @Override
    public void interpretar() {
        System.out.println("Consultando saldo da conta...");
    }
}