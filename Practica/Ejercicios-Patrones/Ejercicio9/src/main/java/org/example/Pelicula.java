package org.example;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int añoEstreno;
    protected List<Pelicula> peliculasSimilares;
    private int puntaje;

    public Pelicula(String titulo, int año, int puntaje)
    {
        this.titulo = titulo;
        this.añoEstreno = año;
        this.puntaje = puntaje;
        this.peliculasSimilares = new LinkedList<Pelicula>();
    }

    public void agregarPelicula(Pelicula p)
    {
        this.peliculasSimilares.add(p);
    }

    public int getAño()
    {
        return this.añoEstreno;
    }

    public int getPuntaje()
    {
        return this.puntaje;
    }

    public Boolean esSimilar(Pelicula p){
        return this.peliculasSimilares.stream().anyMatch( peli -> peli == p);
    }
}
