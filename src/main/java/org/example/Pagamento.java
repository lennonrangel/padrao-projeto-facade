package org.example;

public class Pagamento extends Departamento {

    private static Pagamento pagamento = new Pagamento();

    private Pagamento() {}

    public static Pagamento getInstancia() {
        return pagamento;
    }
}
