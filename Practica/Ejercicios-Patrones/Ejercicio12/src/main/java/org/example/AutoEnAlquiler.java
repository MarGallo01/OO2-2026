package org.example;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private double precioDia;
    private int cantPlazas;
    private String marca;
    private ICancelacion tipoCancelacion;

    public AutoEnAlquiler(double precioDia, int cantPlazas, String marca, ICancelacion tipoCancelacion) {
        this.precioDia = precioDia;
        this.cantPlazas = cantPlazas;
        this.marca = marca;
        this.tipoCancelacion = tipoCancelacion;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void cambiarPolitica(ICancelacion tipo)
    {
        this.tipoCancelacion = tipo;
    }

    public double calcularReembolso(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva)
    {
        return this.tipoCancelacion.calcularCancelacion(monto, fechaCancelacion, fechaReserva);
    }
}
