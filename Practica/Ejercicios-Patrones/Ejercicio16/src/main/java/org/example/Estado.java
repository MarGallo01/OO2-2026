package org.example;

public interface Estado {
    public void inscribir(Excursion excursion, Usuario usuario);
    public String obtenerInformacion(Excursion excursion);
}
