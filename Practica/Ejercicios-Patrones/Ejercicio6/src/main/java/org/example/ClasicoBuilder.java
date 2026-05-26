package org.example;

public class ClasicoBuilder extends SandwichBuilder{
    protected void precioPan()
    {
        this.sandwich.setPrecioPan(100);
    }

    protected void precioAderezo()
    {
        this.sandwich.setPrecioAderezo(20);
    }

    protected void precioPrincipal()
    {
        this.sandwich.setPrecioPrincipal(300);
    }

    protected void precioAdicional()
    {
        this.sandwich.setPrecioAdicional(80);
    }
}
