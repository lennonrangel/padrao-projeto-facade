package org.example;

public class Estoque extends Departamento {

    private static Estoque estoque = new Estoque();

    private Estoque() {}

    public static Estoque getInstancia() {
        return estoque;
    }
}
