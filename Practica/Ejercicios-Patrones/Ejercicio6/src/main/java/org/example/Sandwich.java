package org.example;

public class Sandwich {
    private double precioPan;
    private double precioAderezo;
    private double precioPrincipal;
    private double precioAdicional;

    public void setPrecioPan(double precio) {
        this.precioPan = precio;
    }
    public void setPrecioAderezo(double precio) {
        this.precioAderezo = precio;
    }
    public void setPrecioPrincipal(double precio) {
        this.precioPrincipal = precio;
    }
    public void setPrecioAdicional(double precio) {
        this.precioAdicional = precio;
    }

    public double calcularPrecio()
    {
        return this.precioPan + this.precioAderezo + this.precioPrincipal + this.precioAdicional;
    }
}
