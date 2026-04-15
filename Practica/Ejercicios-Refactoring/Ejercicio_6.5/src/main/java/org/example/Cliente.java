package org.example;

public class Cliente {

    private Direccion direccion;

    public String getDireccionFormateada() {
        return  this.direccion.getDireccionFormateada();
    }
}

/*
Code smells
-- en el uml, direccion tiene sus atributos publicos (public field) -- self encapsulated field
-- metodo largo en supermercado -- extrac method ?
--envidia de atributos en el metodo getDireccionFormateada de cliente,
   resolver con move method, cambiando el metodo de en cliente para que retorne el
   llamado al metodo de direccion retornando atributos encadenados de direccion

 */
