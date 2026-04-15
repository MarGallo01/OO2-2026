package org.example;

public class UsuarioFamiliar extends Usuario{

    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno() * 0.90;
    }
}
