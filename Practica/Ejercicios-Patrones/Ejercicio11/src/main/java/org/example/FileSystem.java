package org.example;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private Directorio raiz;

    public FileSystem(Directorio directorio)
    {
        this.raiz = directorio;
    }

    public int tamanoTotalOcupado()
    {
        return this.raiz.tamañoTotalOcupado();
    }

    public Archivo archivoMasGrande()
    {
        return this.raiz.archivoMasGrande();
    }

    public Archivo archivoMasNuevo()
    {
        return this.raiz.archivoMasNuevo();
    }

    public ElementoFS buscar(String nombre)
    {
        return this.raiz.buscar(nombre);
    }

    public List<ElementoFS> buscarTodos(String nombre)
    {
        return this.raiz.buscarTodos(nombre, new ArrayList<ElementoFS>());
    }

    public String listadoDeContenido()
    {
        return this.raiz.listadoDeContenido();
    }
}
