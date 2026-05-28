package org.example;

public interface IMamifero {
    public IMamifero getMadre();
    public IMamifero getPadre();
    public IMamifero getAbuelaMaterna();
    public IMamifero getAbueloMaterno();
    public IMamifero getAbueloPaterno();
    public IMamifero getAbuelaPaterna();
    public boolean tieneComoAncestroA(Mamifero unMamifero);
}
