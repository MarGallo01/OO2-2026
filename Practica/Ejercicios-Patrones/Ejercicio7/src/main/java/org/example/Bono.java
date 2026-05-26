package org.example;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Bono implements ProductoFinanciero{
    private int parking;

    protected abstract double obtenerVariacionMaxima();

    public double retornoInversion(double monto) {
        // Genera un número aleatorio entre 0.0 y la variación máxima
        double variacionReal = ThreadLocalRandom.current().nextDouble(0, obtenerVariacionMaxima());

        return monto + (monto * variacionReal);
    }

    protected void setParking(int parking)
    {
        this.parking = parking;
    }

    protected int getParkingSilver()
    {
        return 72;
    }

    protected int getParkingGold()
    {
        return 24;
    }
}
