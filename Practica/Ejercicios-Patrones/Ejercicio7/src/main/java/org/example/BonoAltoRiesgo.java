package org.example;

public class BonoAltoRiesgo extends Bono{

    public BonoAltoRiesgo() {
        super();
    }

    @Override
    protected double obtenerVariacionMaxima() {

        return 0.7;
    }
}
