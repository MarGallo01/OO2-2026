package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;


public class ElementosTest {

    ElementoFactory fabrica;
    Atomo oxigeno;
    Atomo hidrogeno;
    Atomo hidrogeno2;
    Atomo cloro;
    Atomo sodio;
    Union H2O;
    Union NaCl;
    Union OH;
    Union NaOH;

    @BeforeEach
    public void setUp(){
        fabrica = new ElementoFactory();
        oxigeno = fabrica.oxigeno();
        hidrogeno = fabrica.hidrogeno();
        hidrogeno2 = fabrica.hidrogeno();
        cloro = fabrica.cloro();
        sodio = fabrica.sodio();
        List elementos = new LinkedList<ElementoQuimico>();
        List elementos2 = new LinkedList<ElementoQuimico>();
        List elementos3 = new LinkedList<ElementoQuimico>();
        List elementosExtra = new LinkedList<ElementoQuimico>();

        elementos.add(hidrogeno);
        elementos.add(oxigeno);
        elementos.add(hidrogeno2);
        H2O = new Union(elementos);

        elementos2.add(sodio);
        elementos2.add(cloro);
        NaCl = new Union(elementos2);

        elementosExtra.add(oxigeno);
        elementosExtra.add(hidrogeno);
        OH = new Union(elementosExtra);

        elementos3.add(sodio);
        elementos3.add(OH);
        NaOH = new Union(elementos3);
    }

    @Test
    public void TestOxigeno(){
        assertEquals(16, oxigeno.pesoMolecular());
        assertEquals(-2, oxigeno.carga());
        assertEquals("O",oxigeno.formula());
    }

    @Test
    public void TestH20(){
        assertEquals(18, H2O.pesoMolecular());
        assertEquals(0, H2O.carga());
        assertEquals("H2O",H2O.formula());
    }

}
