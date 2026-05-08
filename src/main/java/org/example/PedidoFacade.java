package org.example;

public class PedidoFacade {

    public static boolean verificarPendenciasCheckout(Cliente cliente) {
        if (Estoque.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Entrega.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
