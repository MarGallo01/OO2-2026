package org.example;

import java.time.LocalDate;

public interface Icancelacion {
    public double calcularCancelacion(double monto, LocalDate fechaCancelacion, LocalDate fechaReserva);
}
