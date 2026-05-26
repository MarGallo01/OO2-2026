package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SandwichTest {
    Director director;
    Sandwich clasico, vegetariano, vegano, sinTacc;
    ClasicoBuilder clasicoBuilder;
    VegetarianoBuilder vegetarianoBuilder;
    VeganoBuilder veganoBuilder;
    SinTaccBuilder sinTaccBuilder;

    @BeforeEach
    void setUp() throws Exception
    {
        //Clasico
        clasicoBuilder = new ClasicoBuilder();
        director = new Director(clasicoBuilder);
        director.crearSandwich();
        clasico = clasicoBuilder.getSandwich();

        //Vegetariano
        vegetarianoBuilder = new VegetarianoBuilder();
        director.cambiarReceta(vegetarianoBuilder);
        director.crearSandwich();
        vegetariano = vegetarianoBuilder.getSandwich();

        //Vegano
        veganoBuilder = new VeganoBuilder();
        director.cambiarReceta(veganoBuilder);
        director.crearSandwich();
        vegano = veganoBuilder.getSandwich();

        //SinTacc
        sinTaccBuilder = new SinTaccBuilder();
        director.cambiarReceta(sinTaccBuilder);
        director.crearSandwich();
        sinTacc = sinTaccBuilder.getSandwich();
    }

    @Test
    public void clasicoTest()
    {
        assertEquals(500, clasico.calcularPrecio());
    }

    @Test
    public void vegetarianoTest()
    {
        assertEquals(420, vegetariano.calcularPrecio());
    }

    @Test
    public void veganoTest()
    {
        assertEquals(620, vegano.calcularPrecio());
    }

    @Test
    public void sinTaccTest()
    {
        assertEquals(618, sinTacc.calcularPrecio());
    }

}
