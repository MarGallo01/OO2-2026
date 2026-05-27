package org.example;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
    private List<Componente> Componentes;

    public Computadora()
    {
        this.Componentes = new ArrayList<Componente>();
    }

    public void agregarComponente(Componente c)
    {
        this.Componentes.add(c);
    }

    public double consumoTotal()
    {
        return this.Componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
    }

    public double calcularPrecio()
    {
        double precio = this.Componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
        precio += (precio * 0.21);//Agrego IVA
        return precio;
    }
}
