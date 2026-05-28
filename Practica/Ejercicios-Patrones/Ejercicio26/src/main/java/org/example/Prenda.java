package org.example;

public abstract class Prenda {
    private double liquidez;

    public Prenda(double liquidez) {
        this.liquidez = liquidez;
    }

    public double calcularValor()
    {
        return this.calcularExtra() * this.liquidez;
    }

    protected abstract double calcularExtra();
}
