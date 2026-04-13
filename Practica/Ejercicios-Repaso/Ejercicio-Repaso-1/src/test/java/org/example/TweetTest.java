package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TweetTest {
    Tweet tweetValido;

    @BeforeEach
    void setUp() throws Exception {
        // Solo creamos lo que SABEMOS que no va a fallar
        tweetValido = new Tweet("Te busco");
    }

    @Test
    public void testTexto() {
        assertEquals("Te busco", tweetValido.getTexto());
    }

    @Test
    public void testTweetVacioLanzaExcepcion() {
        // Verificamos que REALMENTE explote cuando debe
        assertThrows(IllegalArgumentException.class, () -> {
            new Tweet("");
        });
    }

    @Test
    public void testTweetMuyLargoLanzaExcepcion() {
        String largo = "a".repeat(281);
        assertThrows(IllegalArgumentException.class, () -> {
            new Tweet(largo);
        });
    }
}