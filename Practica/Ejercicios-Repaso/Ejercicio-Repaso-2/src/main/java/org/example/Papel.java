package org.example;

public class Papel implements Jugada{

    @Override
    public String jugarContra(Jugada otra) {
        return otra.jugarContraPapel(this);
    }
    public String jugarContraPiedra(Piedra piedra){
        return "Gana papel";
    }
    public String jugarContraPapel(Papel papel){
        return "empate";
    }
    public String jugarContraTijera(Tijera tijera){
        return "Gana tijera";
    }

}
