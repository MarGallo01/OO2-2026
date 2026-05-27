package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Icancelacion{
    @Override
    public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
        long dias = ChronoUnit.DAYS.between(fechaCancelacion, fechaReserva);
        if((dias < 7) && (dias >= 2)) //entre 6 y 2 dias previos
            monto -= (monto * 0.5);
        else if (dias < 2)//Cancelo 1 dia antes o cuando arranco la reserva
            monto = 0;
        return monto;
    }
}
