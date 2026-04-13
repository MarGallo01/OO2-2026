package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInRing {

    IntRing anilloInt;
    @BeforeEach
    void setUp(){
        int[] arreglo = {10,20};
        anilloInt = new IntRing(arreglo);
    }

    @Test
    void indiceTest(){
        assertEquals(anilloInt.next(),10);
        assertEquals(anilloInt.next(),20);
        assertEquals(anilloInt.next(),10);
    }
}
