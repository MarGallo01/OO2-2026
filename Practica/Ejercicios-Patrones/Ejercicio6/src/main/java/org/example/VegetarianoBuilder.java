package org.example;

public class VegetarianoBuilder extends SandwichBuilder{
    protected void precioPan()
    {
        this.sandwich.setPrecioPan(120);
    }

    protected void precioAderezo()
    {
        this.sandwich.setPrecioAderezo(0);
    }

    protected void precioPrincipal()
    {
        this.sandwich.setPrecioPrincipal(200);
    }

    protected void precioAdicional()
    {
        this.sandwich.setPrecioAdicional(100);
    }
}
