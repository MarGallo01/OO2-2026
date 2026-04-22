package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {

    EmpleadoPasante pasante;

    @BeforeEach
    public void setUp(){
        pasante = new EmpleadoPasante(4,true,3);

    }

    @Test
    public void sueldoTest(){
        assertEquals(23100,pasante.sueldo());
    }


}
