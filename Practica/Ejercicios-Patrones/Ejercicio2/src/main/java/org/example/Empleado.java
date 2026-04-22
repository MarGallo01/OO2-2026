package org.example;

public abstract class Empleado {

    private int cantidadHijos;
    private boolean casado;

    public Empleado (int cantidadHijos , boolean casado ){
        this.cantidadHijos = cantidadHijos;
        this.casado = casado;
    }

    public abstract double calcularSueldoBasico();
    public abstract double calcularAdicionales();
    public double calcularDescuentos(){
        return ((this.calcularSueldoBasico() * 0.13) + (this.calcularAdicionales() * 0.05));
    }

    public double sueldo(){
        return this.calcularSueldoBasico() + this.calcularAdicionales() - this.calcularDescuentos();
    }

    public double extraCasado(){
        if(this.casado){
            return 5000;
        }
        return 0;
    }

    public double extraHijos(){
        return (this.cantidadHijos * 2000);
    }

}
