package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String nombre;
    private List<String> comentarios;
    private Estado estadoActual;
    private LocalDateTime inicio;
    private Duration tiempoAcumulado;

    public ToDoItem(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new Pending();
        this.comentarios = new ArrayList<String>();
        this.tiempoAcumulado = Duration.ZERO;
    }

    protected void iniciarCronometro() { this.inicio = LocalDateTime.now(); }

    protected void pausarCronometro() {
        if (inicio != null) {
            this.tiempoAcumulado = this.tiempoAcumulado.plus(Duration.between(inicio, LocalDateTime.now()));
            this.inicio = null; // Frenamos el reloj
        }
    }

    protected Duration getTiempoTotal() {
        // Si está en progreso, sumamos lo acumulado + lo que va del tramo actual
        if (inicio != null) {
            return tiempoAcumulado.plus(Duration.between(inicio, LocalDateTime.now()));
        }
        return tiempoAcumulado;
    }

    protected void setEstado(Estado e)
    {
        this.estadoActual = e;
    }

    public void start()
    {
        this.estadoActual.start(this);
    }

    public void togglePause()
    {
        this.estadoActual.togglePause(this);
    }

    public void finish()
    {
        this.estadoActual.finish(this);
    }

    public Duration workedTime()
    {
        return this.estadoActual.workedTime(this);
    }

    protected void agregarComentario(String comment)
    {
        this.comentarios.add(comment);
    }

    public void addComment(String comment)
    {
        this.estadoActual.addComment(this, comment);
    }

    public int cantidadComentarios()
    {
        return this.comentarios.size();
    }

}
