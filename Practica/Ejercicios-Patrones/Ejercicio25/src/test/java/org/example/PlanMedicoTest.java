package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanMedicoTest {
    private PlanMedico plan;
    private Afiliado pedro;

    @BeforeEach
    void setUp() {
        plan = new PlanObligatorio(LocalDate.now(), 15000, 3500);
        pedro = new Afiliado("Pedro", 2, 100000, LocalDate.of(1997, 1, 1), plan);
    }

    @Test
    void testPlanObligatorioSinCoseguro() {
        assertEquals(23000, plan.calcularMonto(pedro));
    }
}
