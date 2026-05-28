package org.example;

public class TamañoDecorator extends FileDecorator{
    public TamañoDecorator(FileComponent componente) {
        super(componente);
    }

    @Override
    protected String impresionAdicional() {
        return " - tamaño: " + this.componente.getTamaño();
    }
}
