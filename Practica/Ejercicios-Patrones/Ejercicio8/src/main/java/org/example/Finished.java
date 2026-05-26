package org.example;

import java.time.Duration;

public class Finished implements Estado{

    public void start(ToDoItem item)
    {

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
        return item.getTiempoTotal();
    }

    public void addComment(ToDoItem item, String comment)
    {

    }

}
