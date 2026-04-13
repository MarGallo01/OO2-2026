package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
    Jugador jugador1;
    Jugador jugador2;
    Jugador jugador3;
    @BeforeEach
    void setUp(){
        Jugada piedra = new Piedra();
        Jugada papel = new Papel();
        Jugada tijera = new Tijera();

        jugador1 = new Jugador(piedra);
        jugador2 = new Jugador(tijera);
        jugador3 = new Jugador(papel);
    }

    @Test
    void testPiedra(){
        System.out.println("va piedra");
        System.out.println(jugador1.jugarContra(jugador1));
        System.out.println(jugador1.jugarContra(jugador2));
        System.out.println(jugador1.jugarContra(jugador3));
    }

    @Test
    void testPapel(){
        System.out.println("va papel");
        System.out.println(jugador3.jugarContra(jugador1));
        System.out.println(jugador3.jugarContra(jugador2));
        System.out.println(jugador3.jugarContra(jugador3));
    }

    @Test
    void tesTijera(){
        System.out.println("va tijera");
        System.out.println(jugador2.jugarContra(jugador1));
        System.out.println(jugador2.jugarContra(jugador2));
        System.out.println(jugador2.jugarContra(jugador3));
    }

}
