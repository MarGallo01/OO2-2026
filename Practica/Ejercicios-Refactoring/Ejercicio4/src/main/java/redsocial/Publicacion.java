package redsocial;
public class Publicacion {
    private String texto;
    private int likes;
    public Publicacion(String texto) {
        this.texto = texto;
        this.likes = 0;
    }
    public void darLike() { likes++; }
    public void darDislike() { likes--; }
    private int impacto() {
        return likes * 3;
    }
    public int alcance() {
        return impacto() * 10;
    }
}

// 1) Rename method: procesar (referenciado en línea 11 de Publicacion.java) por impacto
// 2) Rename method: calcular (referenciado en línea 14 de Publicacion.java) por alcance

// 1) Como estamos utilizando rename method debemos cambiar todas las lineas que hagan referencia al metodo original, en este caso el llamado al metodo en la linea 14
// 2) En ese caso debemos tener en cuenta las referencias que se hacen a publicacion en otros codigos, como el que se encuentra en el stream utilizado con el metodo anterior