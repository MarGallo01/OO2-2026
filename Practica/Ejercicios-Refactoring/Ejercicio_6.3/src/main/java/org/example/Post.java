package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private String texto;
    private Usuario usuario;
    private LocalDateTime fecha;

    public LocalDateTime getFecha(){
        return this.fecha;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }
}
