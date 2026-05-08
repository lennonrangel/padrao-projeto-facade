package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Departamento {

    private List<Cliente> clientesComPendencia = new ArrayList<Cliente>();

    public void addClientePendente(Cliente cliente) {
        this.clientesComPendencia.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clientesComPendencia.contains(cliente);
    }
}
