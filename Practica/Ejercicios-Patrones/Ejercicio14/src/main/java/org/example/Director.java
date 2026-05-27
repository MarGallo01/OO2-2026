package org.example;

import java.util.List;

public class Director {
    private ComputadoraBuilder builder;
    private Catalogo catalogo;

    public Director(ComputadoraBuilder builder, Catalogo catalogo)
    {
        this.builder = builder;
        this.catalogo = catalogo;
    }

    public void cambiarTipo(ComputadoraBuilder builder)
    {
        this.builder = builder;
    }

    public Computadora armarComputadora()
    {
        this.builder.iniciarConstruccion();
        this.builder.agregarProcesador(catalogo);
        this.builder.agregarMemoriaRam(catalogo);
        this.builder.agregarDisco(catalogo);
        this.builder.agregarTarjetaGrafica(catalogo);
        this.builder.agregarGabinete(catalogo);
        return this.builder.getComputadora();
    }

    public double crearPresupuesto(List<Componente> componentes)
    {
        return componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
    }
}
