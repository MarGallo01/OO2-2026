package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {

    EmpleadoPlanta planta;

    @BeforeEach
    public void setUp(){
         planta = new EmpleadoPlanta(4,true,3);
    }

    @Test
    public void sueldoTest(){
        assertEquals(61550,planta.sueldo());
    }
}
