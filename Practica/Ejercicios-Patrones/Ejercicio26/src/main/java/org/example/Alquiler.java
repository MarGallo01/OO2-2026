package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda{
    private double costoMensual;
    private LocalDate comienzoContrato;
    private LocalDate finContrato;

    public Alquiler(double liquidez, double costo, LocalDate comienzoContrato, LocalDate finContrato) {
        super(liquidez);
        this.costoMensual = costo;
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
    }

    protected long mesesFaltantes()
    {
        return ChronoUnit.MONTHS.between(comienzoContrato, finContrato);
    }

    protected double calcularExtra()
    {
        return this.costoMensual * this.mesesFaltantes();
    }
}
