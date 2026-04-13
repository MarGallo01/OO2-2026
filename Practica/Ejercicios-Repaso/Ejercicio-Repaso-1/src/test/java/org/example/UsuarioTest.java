package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    Tweet tweet1, tweet2, tweet3;
    Retweet r1;
    List<Itweet> eliminados = new ArrayList<Itweet>();
    Usuario user1;
    @BeforeEach
    void setUp() throws Exception {
        tweet1 = new Tweet("hola");
        tweet2 = new Tweet("chau");
        tweet3 = new Tweet("texto");
        eliminados.add(tweet1);
        eliminados.add(tweet2);
        user1 = new Usuario("Rick Sorkin");
        r1 = new Retweet(tweet2);
        user1.agregarTweet(tweet3);
        user1.agregarTweet(r1);
    }

    @Test
    public void testEliminados() {
        assertEquals(2, user1.cantidadDeTweets());
        user1.eliminarReTweetsAsociados(eliminados);
        assertEquals(1, user1.cantidadDeTweets());
    }
}