package org.example;

public class EmpleadoTemporario extends Empleado {

    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    public double sueldo() {
        return this.getSueldoBasico()
                + (this.horasTrabajadas * 500)
                + (this.cantidadHijos * 1000)
                - (this.getSueldoBasico() * 0.13);
    }
}
