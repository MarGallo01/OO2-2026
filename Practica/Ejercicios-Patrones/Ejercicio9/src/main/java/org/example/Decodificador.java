package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
    private List<Pelicula> peliculas;
    private List<Pelicula> peliculasVistas;
    private Sugerencia sugerencia;

    public void setStrategy(Sugerencia sugerencia)
    {
        this.sugerencia = sugerencia;
    }

    public List<Pelicula> obtenerSugerencias()
    {
        return this.sugerencia.sugerir(this);
    }

    protected List<Pelicula> noVistas(){
        return this.peliculas.stream()
                .filter(p -> !this.peliculasVistas.contains(p)).collect(Collectors.toList());
    }

    protected List<Pelicula> getReproducidad()
    {
        return this.peliculasVistas;
    }
}
