package org.example;

public class EmpleadoTemporario extends Empleado{

    private int cantHoras;

    public EmpleadoTemporario(int cantidadHijos, boolean casado , int horas) {
        super(cantidadHijos, casado);
        this.cantHoras = horas;
    }


    public double calcularSueldoBasico(){
        return 20000 + (this.cantHoras * 300);
    }

    public double calcularAdicionales(){
        return this.extraCasado() + this.extraHijos();
    }

}
