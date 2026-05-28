package org.example;

public class NullMamifero implements IMamifero{
    @Override
    public IMamifero getMadre() {
        return this;
    }

    @Override
    public IMamifero getPadre() {
        return this;
    }

    @Override
    public IMamifero getAbuelaMaterna() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public IMamifero getAbueloMaterno() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public IMamifero getAbueloPaterno() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public IMamifero getAbuelaPaterna() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        // TODO Auto-generated method stub
        return false;
    }
}
