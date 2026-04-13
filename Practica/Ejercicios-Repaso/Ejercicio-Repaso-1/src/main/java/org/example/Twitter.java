package org.example;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private List<Usuario> usuarios;

    public Twitter()
    {
        this.usuarios = new ArrayList<Usuario>();
    }

    public Usuario buscarUsuario(String screenName) {
        return this.usuarios.stream()
                .filter(u -> u.getScreenName().equals(screenName))
                .findFirst()
                .orElse(null);
    }

    public void agregarUsuario(String screenName)
    {
        if (this.buscarUsuario(screenName) != null) {
            throw new IllegalArgumentException("El screenName ya está en uso.");
        }
        // Si no existe, lo creamos y agregamos
        this.usuarios.add(new Usuario(screenName));
    }

    public void eliminarUsuario(String screenName)
    {
        Usuario aEliminar = this.buscarUsuario(screenName);
        if (aEliminar == null) return;
        List<Itweet> tweetsDelUsuario = aEliminar.getTweets();
        this.usuarios.remove(screenName);
        for (Usuario u : usuarios) {
            u.eliminarReTweetsAsociados(tweetsDelUsuario);
        }
    }

    public int cantidadDeUsuarios()
    {
        return this.usuarios.size();
    }
}