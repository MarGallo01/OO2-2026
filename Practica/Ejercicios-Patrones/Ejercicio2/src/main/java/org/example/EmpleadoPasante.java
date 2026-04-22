package org.example;

public class EmpleadoPasante extends Empleado{

    private int cantExamenes;

    public EmpleadoPasante(int cantidadHijos, boolean casado, int cantidadExamenes) {
        super(cantidadHijos, casado);
        this.cantExamenes = cantidadExamenes;
    }
    public double calcularSueldoBasico(){
        return 20000;
    }

    public double calcularAdicionales(){
        return (this.cantExamenes * 2000) ;
    }

}
