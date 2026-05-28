package org.example;

import java.util.ArrayList;
import java.util.List;


public class Combinada extends Prenda{
    private List<Prenda> prendas;

    public Combinada(double liquidez) {
        super(liquidez);
        this.prendas = new ArrayList<Prenda>();
    }

    @Override
    protected double calcularExtra() {
        return this.prendas.stream().mapToDouble(p -> p.calcularValor()).sum();
    }

    public void agregarPrenda(Prenda p)
    {
        this.prendas.add(p);
    }
}
