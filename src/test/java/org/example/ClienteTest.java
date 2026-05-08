package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaEstoqueCheckout() {
        Cliente cliente = new Cliente();
        Estoque.getInstancia().addClientePendente(cliente);
        assertEquals(false, cliente.finalizarPedido());
    }

    @Test
    void deveRetornarPendenciaPagamentoCheckout() {
        Cliente cliente = new Cliente();
        Pagamento.getInstancia().addClientePendente(cliente);
        assertEquals(false, cliente.finalizarPedido());
    }

    @Test
    void deveRetornarPendenciaEntregaCheckout() {
        Cliente cliente = new Cliente();
        Entrega.getInstancia().addClientePendente(cliente);
        assertEquals(false, cliente.finalizarPedido());
    }

    @Test
    void deveRetornarClienteSemPendenciaCheckout() {
        Cliente cliente = new Cliente();
        assertEquals(true, cliente.finalizarPedido());
    }
}
