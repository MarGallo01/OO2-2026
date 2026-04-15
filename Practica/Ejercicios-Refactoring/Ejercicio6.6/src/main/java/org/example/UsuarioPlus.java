package org.example;

public class UsuarioPlus extends Usuario{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
