package org.example;

import java.time.Duration;

public class Paused implements Estado{
    public void start(ToDoItem item)
    {

    }

    public void togglePause(ToDoItem item)
    {
        item.iniciarCronometro();
        item.setEstado(new InProgress());

    }

    public void finish(ToDoItem item)
    {
        item.pausarCronometro();
        item.setEstado(new Finished());
    }

    public Duration workedTime(ToDoItem item)
    {
        return item.getTiempoTotal();
    }

    public void addComment(ToDoItem item, String comment)
    {
        item.agregarComentario(comment);
    }
}
