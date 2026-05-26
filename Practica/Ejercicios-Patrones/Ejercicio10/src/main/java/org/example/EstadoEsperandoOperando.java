package org.example;

public class EstadoEsperandoOperando implements Estado{
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
        calculadora.setEstado(new EsperandoSuma());
    }

    public void menos(Calculadora calculadora)
    {
        calculadora.setEstado(new EsperandoResta());
    }

    public void por(Calculadora calculadora)
    {
        calculadora.setEstado(new EsperandoMultiplicacion());
    }

    public void dividido(Calculadora calculadora)
    {
        calculadora.setEstado(new EsperandoDivision());
    }

    public String resultado(Calculadora calculadora)
    {
        return String.valueOf(calculadora.getResultadoAcumulado());
    }
}
