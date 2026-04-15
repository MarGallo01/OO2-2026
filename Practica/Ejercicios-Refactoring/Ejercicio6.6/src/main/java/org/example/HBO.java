package org.example;

import java.util.List;

public class HBO {
    private List<Usuario> usuarios;
    private List<Pelicula>  peliculas;
}

/*
Code smells
-- HBO seria DATA CLASS?
-- Switch statment por muchos if en usuario  -- Replace condicional with polimorfism | pull up?
-- Envidia de atributos en usuario -- move method
--



 */