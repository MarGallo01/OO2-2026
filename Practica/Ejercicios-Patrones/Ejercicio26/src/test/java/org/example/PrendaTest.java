package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrendaTest {
    Inmueble inmueble;
    Automovil auto;
    Alquiler alquiler;
    LocalDate inicio;
    Combinada combinada;

    @BeforeEach
    void setUp() throws Exception
    {
        auto = new Automovil(0.7 ,10000, 200000, "Nissan Versa", 2023);
        inmueble = new Inmueble(0.2, 2000, "La Plata", 20);
        inicio = LocalDate.of(2026, 2, 1);
        alquiler = new Alquiler(0.9, 5000, inicio, LocalDate.now());
        combinada = new Combinada(0.5);
        combinada.agregarPrenda(auto);
        combinada.agregarPrenda(alquiler);
        combinada.agregarPrenda(inmueble);
    }

    @Test
    public void testInmueble()
    {
        assertEquals(8000, inmueble.calcularValor());
    }

    @Test
    public void testAutoMovil()
    {
        assertEquals(4900, auto.calcularValor());
    }

    @Test
    public void testAutoAlquiler()
    {
        assertEquals(3, alquiler.mesesFaltantes());
        assertEquals(13500, alquiler.calcularValor());
    }

    @Test
    public void testCombinada()
    {
        assertEquals(13200, combinada.calcularValor());
    }
}
