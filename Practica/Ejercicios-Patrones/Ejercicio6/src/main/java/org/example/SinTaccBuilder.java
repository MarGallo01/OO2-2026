package org.example;

public class SinTaccBuilder extends SandwichBuilder{
    protected void precioPan()
    {
        this.sandwich.setPrecioPan(150);
    }

    protected void precioAderezo()
    {
        this.sandwich.setPrecioAderezo(18);
    }

    protected void precioPrincipal()
    {
        this.sandwich.setPrecioPrincipal(250);
    }

    protected void precioAdicional()
    {
        this.sandwich.setPrecioAdicional(200);
    }
}
