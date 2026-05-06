package Interpreter;

//Essa classe representa comandos como:TRANSFERIR 50 PARA JOAO
public class Transferir implements ComandoBancario {

    private double valor;
    private String destino;

    public Transferir(double valor, String destino) {
        this.valor = valor;
        this.destino = destino;
    }

    @Override
    public void interpretar() {
        System.out.println("Transferindo R$ " + valor + " para " + destino + "...");
    }
}
