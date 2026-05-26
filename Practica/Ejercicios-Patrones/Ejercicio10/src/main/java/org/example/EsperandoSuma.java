package org.example;

public class EsperandoSuma extends EstadoCalculo{
    protected double realizarCalculo(double resultado, double unValor)
    {
        return resultado + unValor;
    }

    protected boolean huboError(double unValor)
    {
        return false;
    }
}
