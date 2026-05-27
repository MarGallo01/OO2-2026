package org.example;

import java.time.LocalDate;

public class CancelacionEstricta implements Icancelacion{

    @Override
    public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva) {
        return 0;
    }

}
