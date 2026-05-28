package org.example;

public class Definitivo implements Estado{
    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarUsuario(usuario);
        if(!excursion.hayLugar())  // verificar si se llenó después de agregar
            excursion.setEstado(new Lleno());
    }

    @Override
    public String obtenerInformacion(Excursion excursion) {
        return excursion.armarMensaje() +
                excursion.obtenerEmails() + "Cantidad de usuarios faltantes para el cupo maximo: " + excursion.cantidadParaCupoMax();
    }
}
