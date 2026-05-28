package org.example;

public class ExtensionDecorator extends FileDecorator{
    public ExtensionDecorator(FileComponent componente) {
        super(componente);
    }

    @Override
    protected String impresionAdicional() {
        return " - extension: " + this.componente.getExtension();
    }
}
