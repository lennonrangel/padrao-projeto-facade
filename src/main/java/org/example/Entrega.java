package org.example;

public class Entrega extends Departamento {

    private static Entrega entrega = new Entrega();

    private Entrega() {}

    public static Entrega getInstancia() {
        return entrega;
    }
}
