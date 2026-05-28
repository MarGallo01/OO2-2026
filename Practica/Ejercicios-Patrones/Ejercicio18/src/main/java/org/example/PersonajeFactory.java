package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonajeFactory {

    public Personaje guerrero()
    {
        Arma espada = new Espada();
        Armadura armaduraAcero = new ArmaduraAcero();
        List<String> habilidades = new ArrayList<String>(List.of("Cuerpo a cuerpo"));
        return new Personaje(espada, armaduraAcero, habilidades, 100);
    }

    public Personaje mago()
    {
        Arma baston = new Baston();
        Armadura armaduraCuero = new ArmaduraCuero();
        List<String> habilidades = new ArrayList<String>(List.of("magia", "combate a distancia"));
        return new Personaje(baston, armaduraCuero, habilidades, 100);
    }

    public Personaje arquero()
    {
        Arma arco = new Arco();
        Armadura armaduraCuero = new ArmaduraCuero();
        List<String> habilidades = new ArrayList<String>(List.of("disparo de flechas"));
        return new Personaje(arco, armaduraCuero, habilidades, 100);
    }

    public Personaje thor()
    {
        Arma martillo = new Martillo();
        Armadura armaduraCuero = new ArmaduraCuero();
        List<String> habilidades = new ArrayList<String>(List.of("combate a distancia", "lanzar rayos"));
        return new Personaje(martillo, armaduraCuero, habilidades, 100);
    }

}
