package org.example;

import java.time.LocalDate;

public class Reserva {
    private int cantDias;
    private LocalDate fecha;
    private AutoEnAlquiler auto;
    private Usuario conductor;

    public Reserva(int cantDias, LocalDate fecha, AutoEnAlquiler auto, Usuario conductor) {
        this.cantDias = cantDias;
        this.fecha = fecha;
        this.auto = auto;
        this.conductor = conductor;
    }


    public double montoAPagar()
    {
        return this.auto.getPrecioDia() * this.cantDias;
    }

    public double montoAReembolsar(LocalDate fechaCancelacion)
    {
        return this.auto.calcularReembolso(this.montoAPagar(), fechaCancelacion, this.fecha);
    }
}
