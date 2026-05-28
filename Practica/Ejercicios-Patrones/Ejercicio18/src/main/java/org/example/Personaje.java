package org.example;

import java.util.List;

public class Personaje {
    private Arma arma;
    private Armadura armadura;
    private List<String> habilidades;
    private int vida;

    public Personaje(Arma arma, Armadura armadura, List<String> habilidades, int vida)
    {
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
        this.vida = vida;
    }
    public void pelearContra(Personaje otro)
    {
        if(this.vida > 0)
            this.descontarVida(this.armadura.pelearContra(otro.getArma()));
    }

    public Arma getArma()
    {
        return this.arma;
    }

    protected void descontarVida(int daño)
    {
        this.vida -= daño;
    }
    public int getVida()
    {
        return this.vida;
    }
}
