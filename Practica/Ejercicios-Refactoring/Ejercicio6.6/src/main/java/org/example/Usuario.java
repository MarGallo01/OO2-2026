package org.example;

import java.util.List;

public abstract class Usuario {

    private List<Pelicula> peliculasCompradas;

    // ...
    public abstract double calcularCostoPelicula(Pelicula pelicula);

}
