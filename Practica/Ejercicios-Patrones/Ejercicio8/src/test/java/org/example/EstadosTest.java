package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EstadosTest {
    ToDoItem tarea;

    @BeforeEach
    void setUp() throws Exception
    {
        tarea = new ToDoItem("cambios");
    }

    @Test
    public void pendingTest()
    {
        tarea.addComment("Hola");
        assertEquals(1, tarea.cantidadComentarios());
    }

    @Test
    public void InProgressTest()
    {
        tarea.start();
        tarea.addComment("Hola");
        assertEquals(1, tarea.cantidadComentarios());
    }

    @Test
    public void pausedTest()
    {
        tarea.start();
        tarea.togglePause();
        tarea.addComment("Hola");
        assertEquals(1, tarea.cantidadComentarios());
    }

    @Test
    public void finishedTest()
    {
        tarea.start();
        tarea.finish();
        tarea.addComment("Hola");
        assertEquals(0, tarea.cantidadComentarios());
        assertThrows(RuntimeException.class, () -> {
            tarea.togglePause();
        });
    }

    @Test
    public void testExcepcionPausarEnPending() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            tarea.togglePause();
        });
        assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress", exception.getMessage());
    }

}
