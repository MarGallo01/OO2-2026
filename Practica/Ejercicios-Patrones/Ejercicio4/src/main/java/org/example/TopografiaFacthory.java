package org.example;

public class TopografiaFacthory {
    public Topografia crearAgua()
    {
        return new Simple(1);
    }

    public Topografia crearTierra()
    {
        return new Simple(0);
    }

    public Topografia crearPantano()
    {
        return new Simple(0.7);
    }

    public Topografia crearMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4)
    {
        return new Mixta(t1, t2, t3, t4);
    }
}
