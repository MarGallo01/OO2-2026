package org.example;

import java.time.LocalDate;

public class CancelacionFlexible implements Icancelacion{
    @Override
    public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
        if(fechaCancelacion.isAfter(fechaReserva))
            return 0;
        return monto;
    }
}
