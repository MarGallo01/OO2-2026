package org.example;

public class Lleno implements Estado{
    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarUsuarioEnEspera(usuario);
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return excursion.armarMensaje();
    }
}
