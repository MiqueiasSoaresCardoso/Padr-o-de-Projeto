package Interpreter;

public class InterpretadorBancario {

    public ComandoBancario interpretar(String entrada) {
        String[] partes = entrada.split(" ");

        if (partes[0].equalsIgnoreCase("SALDO")) {
            return new ConsultarSaldo();
        }

        if (partes[0].equalsIgnoreCase("TRANSFERIR")) {
            double valor = Double.parseDouble(partes[1]);
            String destino = partes[3];

            return new Transferir(valor, destino);
        }

        if (partes[0].equalsIgnoreCase("PAGAR") &&
                partes[1].equalsIgnoreCase("BOLETO")) {

            String codigo = partes[2];

            return new PagarBoleto(codigo);
        }

        throw new IllegalArgumentException("Comando inválido.");
    }
}
