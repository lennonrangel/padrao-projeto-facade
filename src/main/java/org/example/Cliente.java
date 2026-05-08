package org.example;

public class Cliente {

    public boolean finalizarPedido() {
        return PedidoFacade.verificarPendenciasCheckout(this);
    }
}
