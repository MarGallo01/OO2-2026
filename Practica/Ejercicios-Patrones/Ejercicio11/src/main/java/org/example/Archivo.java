package org.example;

import java.util.List;

public class Archivo extends ElementoFS{
    private int tamañoBytes;

    public Archivo(String nombre, int tamañoBytes) {
        super(nombre);
        this.tamañoBytes = tamañoBytes;
    }

    public int tamañoTotalOcupado()
    {
        return this.tamañoBytes;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }


    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public ElementoFS buscar(String nombre) {
        if(this.getNombre().equals(nombre))
            return this;
        return null;
    }

    @Override
    public List<ElementoFS> buscarTodos(String nombre, List<ElementoFS> lista) {
        if(this.getNombre().equals(nombre))
            lista.add(this);
        return lista;
    }

    @Override
    public String listadoDeContenido() {

        return this.getNombre();
    }
}
