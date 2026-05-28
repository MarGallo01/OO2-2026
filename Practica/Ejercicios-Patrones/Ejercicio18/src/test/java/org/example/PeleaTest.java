package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PeleaTest {
    Personaje guerrero, mago, arquero, thor;
    PersonajeFactory creador;

    @BeforeEach
    public void setUp() throws Exception
    {
        creador = new PersonajeFactory();
        guerrero = creador.guerrero();
        arquero = creador.arquero();
        mago = creador.mago();
        thor = creador.thor();
    }

    @Test
    public void testPelea()
    {
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        arquero.pelearContra(guerrero);
        assertEquals(4, arquero.getVida());
        //ultima pelea y muere
        arquero.pelearContra(guerrero);
        assertEquals(-4, arquero.getVida());
        //No pelea más
        arquero.pelearContra(guerrero);
        assertEquals(-4, arquero.getVida());

        //peleas thor
        mago.pelearContra(thor);
        assertEquals(94, mago.getVida());
        guerrero.pelearContra(thor);
        assertEquals(97, guerrero.getVida());
    }
}
