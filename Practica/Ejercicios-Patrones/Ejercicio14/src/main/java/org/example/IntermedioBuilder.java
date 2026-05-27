package org.example;

public class IntermedioBuilder extends ComputadoraBuilder {
    @Override
    public void agregarProcesador(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("Procesador Intermedio"));
    }

    @Override
    public void agregarMemoriaRam(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("16 GB"));
    }

    @Override
    public void agregarDisco(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("SSD 500 GB"));
    }

    @Override
    public void agregarTarjetaGrafica(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("GTX 1650"));
    }

    @Override
    public void agregarGabinete(Catalogo catalogo) {
        this.getComputadora().agregarComponente(catalogo.getComponente("Gabinete Intermedio"));
        this.getComputadora().agregarComponente(catalogo.getComponente("Fuente 800 w"));
    }

}
