package org.example;

public class Piedra implements Jugada{

    public String jugarContra(Jugada otra) {
        return otra.jugarContraPiedra(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "empate";
    }
    public String jugarContraPapel(Papel papel){
        return "gana papel";
    }
    public String jugarContraTijera(Tijera tijera){
        return "Gana piedra";
    }
}

