package org.example;

public class EmpleadoPlanta extends Empleado{

    private int cantidadHijos = 0;
    // ......
    public double sueldo() {
        return this.getSueldoBasico()
                + (this.cantidadHijos * 2000)
                - (this.getSueldoBasico() * 0.13);
    }
}
