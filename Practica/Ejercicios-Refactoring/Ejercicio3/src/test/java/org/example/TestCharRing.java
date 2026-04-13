package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;


public class TestCharRing {
    CharRing anilloChar;
    @BeforeEach
    void setUp(){
        String prueba = "casa";
        anilloChar = new CharRing(prueba);
    }

    @Test
    void indiceTest(){
        assertEquals(anilloChar.next() , 'c');
        assertEquals(anilloChar.next() , 'a');
        assertEquals(anilloChar.next() , 's');
        assertEquals(anilloChar.next() , 'a');
        assertEquals(anilloChar.next() , 'c');
    }
}
