package org.example;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private Double sueldoBasico = 0.0;

    public Double getSueldoBasico() {
        return sueldoBasico;
    }
    public String getApellido(){
        return this.apellido;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract double sueldo();
}
