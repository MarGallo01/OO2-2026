package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
    Twitter twitter;
    @BeforeEach
    void setUp() throws Exception {
        twitter = new Twitter();
        twitter.agregarUsuario("usuario");
    }

    @Test
    public void testScreenNameValido() {
        assertEquals(1, twitter.cantidadDeUsuarios());
    }

    @Test
    public void testScreenNameInvalido() {

        assertThrows(IllegalArgumentException.class, () -> {
            twitter.agregarUsuario("usuario");
        });
    }

    @Test
    void testEliminacionEnCascadaCompleta() {
        // 1. Preparación
        twitter.agregarUsuario("Messi");
        twitter.agregarUsuario("Messi Fan");

        Usuario messi = twitter.buscarUsuario("Messi");
        Usuario fan = twitter.buscarUsuario("Messi Fan");

        Tweet original = new Tweet("Ganamos la tercera");
        messi.agregarTweet(original);

        Retweet rt = new Retweet(original);
        fan.agregarTweet(rt);

        // 2. Acción: Borramos al dueño del tweet original
        twitter.eliminarUsuario("Messi");

        // 3. Verificación: El fan ya no debería tener el Retweet
        assertEquals(0, fan.cantidadDeTweets(), "El retweet del fan debería haberse borrado en cascada");
    }
}
