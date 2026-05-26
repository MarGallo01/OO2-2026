package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionTest {

    Membresia bancoSilver;
    ProductoFinanciero producto1;

    @BeforeEach
    void setUp() throws Exception
    {
        bancoSilver = new Silver();
        producto1 = bancoSilver.crearProducto1();
    }

    @Test
    public void producto1Test()
    {
        assertEquals(3050, producto1.retornoInversion(1000));
    }

}
