package org.example;

public class Cliente {

    private Direccion direccion;

    public String getDireccionFormateada() {
        return  this.direccion.getLocalidad() + " , " + this.direccion.getCalle() + " , " + this.direccion.getNumero() + " , " + this.direccion.getDepartamento();
    }
}

/*
Code smells
-- en el uml, direccion tiene sus atributos publicos (public field) -- self encapsulated field
-- metodo largo en supermercado -- extrac method ?

 */
