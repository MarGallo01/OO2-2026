package org.example;

public abstract class ComputadoraBuilder {
    private Computadora computadora;

    public void iniciarConstruccion() {
        this.computadora = new Computadora();
    }

    protected Computadora getComputadora()
    {
        return this.computadora;
    }

    public abstract void agregarProcesador(Catalogo catalogo);
    public abstract void agregarMemoriaRam(Catalogo catalogo);
    public abstract void agregarDisco(Catalogo catalogo);
    public abstract void agregarTarjetaGrafica(Catalogo catalogo);
    public abstract void agregarGabinete(Catalogo catalogo);
}
