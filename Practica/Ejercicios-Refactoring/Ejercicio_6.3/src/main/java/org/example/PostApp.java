package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {

    private List<Post> posts;

    public List<Post> ultimosPosts(Usuario user, int cantidad) {


/*
    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
    for (Post post : this.posts) {
        if (!post.getUsuario().equals(user)) {
            postsOtrosUsuarios.add(post);
        }
    }

     ordena los posts por fecha
    for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
        int masNuevo = i;
        for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
            if (postsOtrosUsuarios.get(j).getFecha().isAfter(
                postsOtrosUsuarios.get(masNuevo).getFecha())) {
                masNuevo = j;
            }
        }
        Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
        postsOtrosUsuarios.set(masNuevo, unPost);
    }

    List<Post> ultimosPosts = new ArrayList<Post>();
    int index = 0;
    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
    while (postIterator.hasNext() && index < cantidad) {
        ultimosPosts.add(postIterator.next());
    }
    return ultimosPosts;

 */
        List<Post> postsOtrosUsuarios = new ArrayList<Post>();
        postsOtrosUsuarios = this.posts.stream().filter(post -> !post.getUsuario().equals(user)).collect(Collectors.toList());
        List<Post> postOtrosOrdenados = postsOtrosUsuarios.stream().sorted((x1,x2) -> x1.getFecha().compareTo(x2.getFecha())).collect(Collectors.toList());
        List<Post> ultimosPosts = postOtrosOrdenados.stream().limit(cantidad).collect(Collectors.toList());
        return ultimosPosts;
}

/*

Code smells:
-- Imperative Loops (Bucles Imperativos):
-- Metodo largo -- uso extract method ? o lo dejo con esas lineas de streams

   preguntar si se puede agregar codigo , por ejemplo metodos para chequear un booleano

 */
}
