package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ExcursionTest {
    @Test
    public void testInscribirEnExcursionLlena() {
        Excursion excursion = new Excursion(
                "Dos días en kayak bajando el Paraná",
                LocalDate.of(2026, 6, 1),
                LocalDate.of(2026, 6, 2),
                "Puerto Paraná",
                15000.0,
                1, // cupo mínimo
                2  // cupo máximo
        );

        Usuario usuario1 = new Usuario("Juan", "Perez", "juan@gmail.com");
        Usuario usuario2 = new Usuario("Ana", "Lopez", "ana@gmail.com");
        Usuario usuario3 = new Usuario("Carlos", "Garcia", "carlos@gmail.com");

        usuario1.anotarAExcursion(excursion);
        usuario2.anotarAExcursion(excursion);
        usuario3.anotarAExcursion(excursion); // debería ir a lista de espera

        assertTrue(excursion.estaEnEspera(usuario3));
    }
}
