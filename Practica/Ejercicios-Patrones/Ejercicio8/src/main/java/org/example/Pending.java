package org.example;

import java.time.Duration;

public class Pending implements Estado{
    public void start(ToDoItem item)
    {
        item.iniciarCronometro();
        item.setEstado(new InProgress());
    }

    public void togglePause(ToDoItem item)
    {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem item)
    {

    }

    public Duration workedTime(ToDoItem item)
    {
        throw new RuntimeException("Tarea no iniciada");
    }

    public void addComment(ToDoItem item, String comment)
    {
        item.agregarComentario(comment);
    }
}
