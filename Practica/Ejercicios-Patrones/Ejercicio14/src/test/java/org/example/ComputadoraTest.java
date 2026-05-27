package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputadoraTest {
    Catalogo catalogo;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo();
        // Componentes para la PC Gamer
        catalogo.agregarComponente(new Componente("Procesador Gamer", "Procesador Gamer", 500, 100));
        catalogo.agregarComponente(new Componente("Pad Termico", "Pad Termico", 10, 0));
        catalogo.agregarComponente(new Componente("Cooler", "Cooler", 40, 10));
        catalogo.agregarComponente(new Componente("32 GB", "32 GB", 150, 20));
        catalogo.agregarComponente(new Componente("SSD 500 GB", "SSD 500 GB", 100, 10));
        catalogo.agregarComponente(new Componente("SSD 1 TB", "SSD 1 TB", 200, 15));
        catalogo.agregarComponente(new Componente("RTX 4090", "RTX 4090", 1500, 300));
        catalogo.agregarComponente(new Componente("Gabinete Gamer", "Gabinete Gamer", 100, 0));
        catalogo.agregarComponente(new Componente("Fuente 712 w", "Fuente 712 w", 200, 0));
    }

    @Test
    void testConfiguracionGamer() {
        GamerBuilder builder = new GamerBuilder();
        Director director = new Director(builder, catalogo);

        Computadora pcGamer = director.armarComputadora();

        // 1. Verificar Consumo (Procesador 100 + Cooler 10 + RAM (2x20) + Discos (10+15) + Placa 300 = 475)
        assertEquals(475.0, pcGamer.consumoTotal(), "El consumo antes de la fuente debe ser correcto");

        // 2. Verificar Precio Final (Suma de todo + 21% IVA)
        // Precio componentes: 500+10+40+300+100+200+1500+100+200 (fuente) = 2950
        // 2950 * 1.21 = 3569.5
        assertEquals(3569.5, pcGamer.calcularPrecio(), 0.01);
    }
}
