package org.example;

public class Provisorio implements Estado{
    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarUsuario(usuario);
        if(excursion.superoCupoMinimo())
            excursion.setEstado(new Definitivo());
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return excursion.armarMensaje() +
                "Cantidad de usuarios faltantes para el cupo minimo: " + excursion.cantidadParaCupoMin();
    }
}
