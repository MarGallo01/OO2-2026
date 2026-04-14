package org.example;

public class EmpleadoPasante extends Empleado{


    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13);
    }
}

/*
(i) indique el mal olor,
(ii) indique el refactoring que lo corrige,
(iii) aplique el refactoring, mostrando el resultado final (código y/o diseño según
      corresponda).
Si vuelve a encontrar un mal olor, retorne al paso (i).

i) Malos olores encontrados:
    - Codigo repetido - Public field o campos publicos
    -
    -
    -
ii) Primero uso pull up method, generando la clase abstracta empleado, para subir los atributos en comun nombre, apellido y sueldo basico.
    Luego uso self-encapsulate fiel para cambiar los atributos de publicos a privado, ademas de generar sus correspondientes getters.


 */
