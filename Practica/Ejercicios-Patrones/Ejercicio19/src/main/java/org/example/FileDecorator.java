package org.example;

import java.awt.Component;
import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent{
    protected FileComponent componente;

    public FileDecorator(FileComponent componente) {
        this.componente = componente;
    }

    @Override
    public String prettyPrint() {
        return componente.prettyPrint() + this.impresionAdicional();
    }

    protected abstract String impresionAdicional();

    @Override
    public double getTamaño()
    {
        return this.componente.getTamaño();
    }

    @Override
    public String getExtension()
    {
        return this.componente.getExtension();
    }

    @Override
    public String getPermisos()
    {
        return this.componente.getPermisos();
    }

    @Override
    public LocalDate getFechaCreacion()
    {
        return this.getFechaCreacion();
    }
    public LocalDate getFechaModificacion()
    {
        return this.getFechaModificacion();
    }
}
