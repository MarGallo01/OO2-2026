package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends ElementoFS {

    private List<ElementoFS> contenido;
    private int tamañoInicial;

    public Directorio(String nombre, int tamañoInicial) {
        super(nombre);
        this.contenido = new ArrayList<ElementoFS>();
        this.tamañoInicial = tamañoInicial;
    }

    public void agregarContenido(ElementoFS e)
    {
        this.contenido.add(e);
    }

    @Override
    public int tamañoTotalOcupado() {
        return this.contenido.stream().mapToInt(c -> c.tamañoTotalOcupado()).sum() + this.tamañoInicial;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream()
                .map(c -> c.archivoMasGrande())
                .max((c1, c2) -> Double.compare(c1.tamañoTotalOcupado(), c2.tamañoTotalOcupado()))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream().map(c -> c.archivoMasNuevo())
                .sorted((c1, c2) -> c1.getFecha().compareTo(c2.getFecha()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public ElementoFS buscar(String nombre) {
        if(this.getNombre().equals(nombre))
            return this;
        return this.contenido.stream()
                .map(c -> c.buscar(nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ElementoFS> buscarTodos(String nombre, List<ElementoFS> lista) {
        if(this.getNombre().equals(nombre))
            lista.add(this);
        this.contenido.stream().map(c -> c.buscarTodos(nombre, lista));
        return lista;
    }

    @Override
    public String listadoDeContenido() {
        return this.getNombre() + "/" + this.contenido.stream().map(c-> c.listadoDeContenido());
    }

}
