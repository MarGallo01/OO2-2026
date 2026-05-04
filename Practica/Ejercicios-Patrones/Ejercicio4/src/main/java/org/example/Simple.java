package org.example;

public class Simple implements Topografia{
    private double proporcionAgua;

    public Simple(double proporcionAgua) {
        this.proporcionAgua = proporcionAgua;
    }

    @Override
    public double proporcionAgua() {
        return proporcionAgua;
    }

    @Override
    public double proporcionTierra() {
        return 1-proporcionAgua;
    }

    public boolean esIgualAMixta(Mixta t) {
        return false;
    }

    public boolean equals(Object t) {
        return this.proporcionAgua() == ((Topografia)t).proporcionAgua();
    }
}
