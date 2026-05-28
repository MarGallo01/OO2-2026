package org.example;

import java.time.LocalDate;

public abstract class PlanMedico {
    private LocalDate fechaCreacion;
    private double montoInicial;
    private double cargoFamiliar;
    private int limitePrestaciones;

    public PlanMedico(LocalDate fechaCreacion, double montoInicial, double cargoFamiliar) {
        this.fechaCreacion = fechaCreacion;
        this.montoInicial = montoInicial;
        this.cargoFamiliar = cargoFamiliar;
    }

    public double calcularMonto(Afiliado afiliado)
    {
        double monto = this.montoInicial;
        monto += this.basicoAdicional(afiliado);
        monto = this.calcularSeguroInternacion(monto);
        monto += this.montoFamiliar(afiliado);
        monto += this.montoCobertura(afiliado);
        return monto;
    }
    public LocalDate getFechaContratacion()
    {
        return this.fechaCreacion;
    }

    protected double getMontoInicial()
    {
        return this.montoInicial;
    }

    protected double getCargoFamiliar()
    {
        return this.cargoFamiliar;
    }

    protected int getLimitePrestaciones()
    {
        return this.limitePrestaciones;
    }

    protected abstract double basicoAdicional(Afiliado afiliado);
    protected abstract double calcularSeguroInternacion(double monto);
    protected abstract double montoFamiliar(Afiliado afiliado);
    protected abstract double montoCobertura(Afiliado afiliado);
}
