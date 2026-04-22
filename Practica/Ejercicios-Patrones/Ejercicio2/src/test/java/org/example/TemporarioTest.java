package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {

    EmpleadoTemporario temporario;

    @BeforeEach
    public void setUp(){
       temporario = new EmpleadoTemporario(4,true,3);
    }

    @Test
    public void sueldoTest(){
        assertEquals(30533,temporario.sueldo());
    }



}
