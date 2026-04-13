package org.example;

public class Tijera implements Jugada{

    public String jugarContra(Jugada otra) {
        return otra.jugarContraTijera(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "Gana piedra";
    }
    public String jugarContraPapel(Papel papel){
        return "gana tijera";
    }
    public String jugarContraTijera(Tijera tijera){
        return "empate";
    }
}
