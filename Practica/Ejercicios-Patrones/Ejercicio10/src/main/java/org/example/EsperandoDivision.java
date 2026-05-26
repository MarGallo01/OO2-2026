package org.example;

public class EsperandoDivision extends EstadoCalculo{
    protected double realizarCalculo(double resultado, double unValor)
    {
        if(this.huboError(unValor))
            return 0;
        else
            return resultado / unValor;
    }

    protected boolean huboError(double unValor)
    {
        if(unValor == 0)
            return true;
        else
            return false;
    }
}
