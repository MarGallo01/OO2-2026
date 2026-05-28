package org.example;

import java.time.LocalDate;

public class Automovil extends Prenda {
    private double costoKM;
    private int kilometros;
    private String modelo;
    private int añoFabricacion;

    public Automovil(double liquidez, double costo, int km, String modelo, int año) {
        super(liquidez);
        this.costoKM = costo;
        this.kilometros = km;
        this.modelo = modelo;
        this.añoFabricacion = año;
    }

    private int obtenerAntiguedad()
    {
        return LocalDate.now().getYear() - this.añoFabricacion;
    }
    protected double calcularExtra()
    {
        if(this.obtenerAntiguedad() >= 10)
            this.costoKM = 0;
        else
            this.costoKM -= (this.costoKM * (this.obtenerAntiguedad() * 0.1));
        return this.costoKM;
    }
}
