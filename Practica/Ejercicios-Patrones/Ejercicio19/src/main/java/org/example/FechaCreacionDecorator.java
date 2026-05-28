package org.example;

public class FechaCreacionDecorator extends FileDecorator{
    public FechaCreacionDecorator(FileComponent componente) {
        super(componente);
    }

    @Override
    protected String impresionAdicional() {
        return " - fecha de creación: " + this.componente.getFechaCreacion();
    }
}
