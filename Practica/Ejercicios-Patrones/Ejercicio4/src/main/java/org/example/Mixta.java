package org.example;
import java.util.ArrayList;


public class Mixta implements Topografia{
    private ArrayList<Topografia> tipo;

    public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4)
    {
        this.tipo = new ArrayList<Topografia>();
        this.tipo.add(t1);
        this.tipo.add(t2);
        this.tipo.add(t3);
        this.tipo.add(t4);
    }

    public double proporcionAgua()
    {
        return this.tipo.stream().mapToDouble(t -> t.proporcionAgua()).sum() / 4.0;
    }

    public double proporcionTierra()
    {
        return this.tipo.stream().mapToDouble(t -> t.proporcionTierra()).sum() / 4.0;
    }

    public boolean esIgualAMixta(Mixta mixta)
    {
        return this.tipo.equals(mixta.getTipo());
    }

    public boolean equals(Object t) {
        return ((Topografia)t).esIgualAMixta(this);
    }

    protected ArrayList<Topografia> getTipo()
    {
        return this.tipo;
    }
}
