package Facade.subsistemas;

import Facade.model.Cliente;

public class ClienteService {
    public void validarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não informado.");
        }

        if (!cliente.isAtivo()) {
            throw new IllegalStateException("Cliente inativo.");
        }

        if (cliente.getEmail() == null || cliente.getEmail().isBlank()) {
            throw new IllegalArgumentException("E-mail do cliente inválido.");
        }

        System.out.println("Cliente validado com sucesso.");
    }
}