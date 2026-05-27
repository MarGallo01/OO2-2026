package org.example;

public class GamerBuilder extends ComputadoraBuilder{
    @Override
    public void agregarProcesador(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("Procesador Gamer"));
        this.getComputadora().agregarComponente(catalogo.getComponente("Pad Termico"));
        this.getComputadora().agregarComponente(catalogo.getComponente("Cooler"));
    }

    @Override
    public void agregarMemoriaRam(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("32 GB"));
        this.getComputadora().agregarComponente(catalogo.getComponente("32 GB"));
    }

    @Override
    public void agregarDisco(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("SSD 500 GB"));
        this.getComputadora().agregarComponente(catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    public void agregarTarjetaGrafica(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("RTX 4090"));
    }

    @Override
    public void agregarGabinete(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("Gabinete Gamer"));
        int consumoFinal = (int) (this.getComputadora().consumoTotal() * 1.5);
        this.getComputadora().agregarComponente(catalogo.getComponente("Fuente " + consumoFinal + " w"));
    }
}
