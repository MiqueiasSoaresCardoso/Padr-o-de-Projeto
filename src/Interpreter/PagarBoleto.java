package Interpreter;

/*Essa classe representa comandos como: PAGAR BOLETO 12345*/
public class PagarBoleto implements ComandoBancario {

    private String codigoBoleto;

    public PagarBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void interpretar() {
        System.out.println("Pagando boleto de código " + codigoBoleto + "...");
    }
}