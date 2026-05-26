package org.example;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoFS {

    private String nombre;
    private LocalDate fechaCreacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public abstract int tamañoTotalOcupado();

    public abstract Archivo archivoMasGrande();

    public abstract Archivo archivoMasNuevo();

    public abstract ElementoFS buscar(String nombre);

    public abstract List<ElementoFS> buscarTodos(String nombre, List<ElementoFS> lista);

    public abstract String listadoDeContenido();

    protected LocalDate getFecha()
    {
        return this.fechaCreacion;
    }

    protected String getNombre()
    {
        return this.nombre;
    }

}
