package org.example;

public class Inmueble extends Prenda{
    private String direccion;
    private int superficie;
    private double costoM2;

    public Inmueble(double liquidez, double costo, String direccion, int superficie) {
        super(liquidez);
        this.costoM2 = costo;
        this.direccion = direccion;
        this.superficie = superficie;
    }

    protected double calcularExtra()
    {
        return this.costoM2 * this.superficie;
    }
}
