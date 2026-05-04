package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {

    TopografiaFacthory creador;
    Topografia agua, tierra, pantano, mixta, mixtaConMixta;

    @BeforeEach
    void setUp() throws Exception{
        creador = new TopografiaFacthory();
        agua = creador.crearAgua();
        tierra = creador.crearTierra();
        pantano = creador.crearPantano();
        mixta = creador.crearMixta(agua, tierra, agua, tierra);
        mixtaConMixta = creador.crearMixta(agua, tierra, agua, tierra);
    }

    @Test
    public void testEquals()
    {
        assertFalse(agua.equals(tierra));
        assertTrue( agua.equals(new Simple(1)));
        assertFalse(agua.equals(new Mixta(new Simple(1), new Simple(0), new Simple(1), new Simple(0))));
        assertFalse((new Mixta(new Simple(1), new Simple(0), new Simple(1), new Simple(0))).equals(agua));
        assertTrue((new Mixta(new Simple(1), new Simple(0), new Simple(1), new Simple(0))).equals(mixtaConMixta));
//		assertTrue(mixta.equals(mixta)); aca llama al equals de object, comapra la misma referencia
    }

    @Test
    public void testProporciones()
    {
        assertEquals(1, tierra.proporcionTierra());
        assertEquals(0, tierra.proporcionAgua());
        assertEquals(1, agua.proporcionAgua());
        assertEquals(0, agua.proporcionTierra());
        assertEquals(0.7, pantano.proporcionAgua());
        assertEquals(0.3, pantano.proporcionTierra(), 0.0001);
        assertEquals(0.5, mixta.proporcionAgua(), 0.0001);
    }
}
