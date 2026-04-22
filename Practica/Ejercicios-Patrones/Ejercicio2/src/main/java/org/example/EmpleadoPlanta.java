package org.example;

public class EmpleadoPlanta extends Empleado{

    private int antiguedad;

    public EmpleadoPlanta(int cantidadHijos, boolean casado , int antiguedad) {
        super(cantidadHijos, casado);
        this.antiguedad = antiguedad;
    }

    public double calcularSueldoBasico(){
        return 50000;
    }


    public double calcularAdicionales(){
        return this.extraCasado() + this.extraHijos() + (this.antiguedad * 2000);
    }

}
