package org.example;

public class Director {
    private SandwichBuilder builder;

    public Director(SandwichBuilder builder)
    {
        this.builder = builder;
    }

    public void cambiarReceta(SandwichBuilder builder)
    {
        this.builder = builder;
    }

    public void crearSandwich()
    {
        this.builder.crearSandwich();
        this.builder.precioPan();
        this.builder.precioAderezo();
        this.builder.precioPrincipal();
        this.builder.precioAdicional();
    }
}
