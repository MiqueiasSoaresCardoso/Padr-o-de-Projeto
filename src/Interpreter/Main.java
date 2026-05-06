package Interpreter;

public class Main {
    public static void main(String[] args) {

        InterpretadorBancario interpretador = new InterpretadorBancario();

        ComandoBancario comando1 = interpretador.interpretar("SALDO");
        comando1.interpretar();

        ComandoBancario comando2 = interpretador.interpretar("TRANSFERIR 50 PARA JOAO");
        comando2.interpretar();

        ComandoBancario comando3 = interpretador.interpretar("PAGAR BOLETO 12345");
        comando3.interpretar();
    }
}
