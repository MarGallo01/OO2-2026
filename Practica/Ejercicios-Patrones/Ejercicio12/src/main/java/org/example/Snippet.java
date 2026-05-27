package org.example;

import java.time.LocalDate;

public class Snippet {
    public static void main(String[] args) {
        // 1. Crear auto con política Flexible
        ICancelacion flexible = new CancelacionFlexible();
        AutoEnAlquiler miAuto = new AutoEnAlquiler(1000, 5, "Fiat", flexible);
        Usuario pepito = new Usuario("Pepito");

        // Reserva de 3 días para mañana
        Reserva miReserva = new Reserva(3, LocalDate.now().plusDays(1), miAuto, pepito);

        // Imprimir reembolso actual (Flexible = 100%)
        System.out.println("Monto a pagar: " + miReserva.montoAPagar());
        System.out.println("Reembolso Flexible: " + miReserva.montoAReembolsar(LocalDate.now()));

        // 2. Cambiar política a Moderada
        miAuto.cambiarPolitica(new CancelacionModerada());

        // Imprimir de nuevo (Como es solo 1 día antes, debería ser 0 o 50% según la lógica)
        System.out.println("Reembolso Moderado (1 día antes): " + miReserva.montoAReembolsar(LocalDate.now()));
    }
}
