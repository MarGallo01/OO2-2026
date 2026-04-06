package org.example;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Twitter {
    private LinkedList<Usuario> usuarios;

    public Twitter(){
        this.usuarios = new LinkedList<Usuario>();
    }

    public void agregarUsuario(Usuario user){
        if(this.buscarUsuario(user.getScreenName()) == null){
            System.out.println("Ya existe el usuario");
        }
        else {
            this.usuarios.add(user);
        }

    }

    public Usuario buscarUsuario(String nombre){
        return this.usuarios.stream().filter(usuario -> usuario.quienSoy().equals(nombre)).findFirst().orElse(null);
    }

    public void eliminarUsuario(String usuario){

    }
}
