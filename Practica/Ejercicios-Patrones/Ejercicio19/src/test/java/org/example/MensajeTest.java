package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeTest {
    FileOO2 archivo;
    LocalDate fecha;
    FileDecorator decorator;

    @BeforeEach
    public void setUp() throws Exception
    {
        fecha = LocalDate.of(2026, 2, 10);
        archivo = new FileOO2("archivo1", ".png", "--x", 200, fecha);
    }

    @Test
    public void testMensajes()
    {
        assertEquals("Nombre: archivo1", archivo.prettyPrint());
        assertEquals("Nombre: archivo1 - extension: .png", new ExtensionDecorator(archivo).prettyPrint());
        assertEquals("Nombre: archivo1 - extension: .png - tamaño: 200.0", new TamañoDecorator(new ExtensionDecorator(archivo)).prettyPrint());
    }
}
