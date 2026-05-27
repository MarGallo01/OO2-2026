package org.example;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo()
    {
        this.componentes = new ArrayList<Componente>();
    }

    public void agregarComponente(Componente c)
    {
        this.componentes.add(c);
    }

    public Componente getComponente(String descripcion) {
        return this.componentes.stream()
                .filter(c -> c.getDescripcion().trim().equalsIgnoreCase(descripcion.trim())) // Ignora mayúsculas
                .findFirst()
                .orElse(null);
    }
}
