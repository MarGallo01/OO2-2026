package org.example;

public class EstadoError implements Estado{
    public void borrar(Calculadora calculadora)
    {
        calculadora.actualizarResultado(0);
        calculadora.setEstado(new EstadoInicial());
    }

    public void setValor(double unValor, Calculadora calculadora)
    {

    }

    public void mas(Calculadora calculadora)
    {

    }

    public void menos(Calculadora calculadora)
    {

    }

    public void por(Calculadora calculadora)
    {

    }

    public void dividido(Calculadora calculadora)
    {

    }

    public String resultado(Calculadora calculadora)
    {
        return "Error";
    }
}
