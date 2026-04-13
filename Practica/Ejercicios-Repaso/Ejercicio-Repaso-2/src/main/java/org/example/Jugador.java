package org.example;

public class Jugador {
    private Jugada unaJugada;

    public Jugador(Jugada xjugada){
        this.unaJugada = xjugada;
    }

    public void cambiarJugada(Jugada otra){
        this.unaJugada = otra;
    }

    public Jugada getJugada(){
        return this.unaJugada;
    }

    public String jugarContra(Jugador unJugador){
        return this.getJugada().jugarContra(unJugador.getJugada());
    }
}
