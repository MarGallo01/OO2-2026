package org.example;

public class EstadoInicial implements Estado{
    public void borrar(Calculadora calculadora)
    {
        calculadora.actualizarResultado(0);
    }

    public void setValor(double unValor, Calculadora calculadora)
    {
        calculadora.actualizarResultado(unValor);
        calculadora.setEstado(new EstadoEsperandoOperando());
    }

    public void mas(Calculadora calculadora)
    {
        calculadora.setEstado(new EstadoError());
    }

    public void menos(Calculadora calculadora)
    {
        calculadora.setEstado(new EstadoError());
    }

    public void por(Calculadora calculadora)
    {
        calculadora.setEstado(new EstadoError());
    }

    public void dividido(Calculadora calculadora)
    {
        calculadora.setEstado(new EstadoError());
    }

    public String resultado(Calculadora calculadora)
    {
        return String.valueOf(calculadora.getResultadoAcumulado());
    }
}
