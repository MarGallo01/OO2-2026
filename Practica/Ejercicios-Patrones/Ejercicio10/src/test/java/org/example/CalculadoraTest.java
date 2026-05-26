package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSumaSimple() {
        Calculadora calc = new Calculadora();
        calc.setValor(5);
        calc.mas();
        calc.setValor(3);
        assertEquals("8.0", calc.getResultado());
    }

    @Test
    void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        calc.setValor(10);
        calc.por();
        calc.setValor(2);
        assertEquals("20.0", calc.getResultado());
    }

    @Test
    void testErrorPorDobleOperacion() {
        Calculadora calc = new Calculadora();
        calc.setValor(5);
        calc.mas();
        calc.menos();
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testErrorPorResultadoApresurado() {
        Calculadora calc = new Calculadora();
        calc.setValor(5);
        calc.mas();
        // Pedir el resultado cuando todavía falta el segundo operando
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        calc.setValor(10);
        calc.dividido();
        calc.setValor(0);
        assertEquals("Error", calc.getResultado());
    }

    @Test
    void testBorrarReiniciaTodo() {
        Calculadora calc = new Calculadora();
        calc.setValor(10);
        calc.dividido();
        calc.setValor(0); // Entra en Error

        calc.borrar(); // Debería volver a EstadoInicial
        calc.setValor(5);
        assertEquals("5.0", calc.getResultado());
    }
}
