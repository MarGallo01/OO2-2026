package org.example;

public class UsuarioBasico extends Usuario {
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno() ;
    }
}
