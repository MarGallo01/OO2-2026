package org.example;

public abstract class EstadoCalculo implements Estado{
    public void borrar(Calculadora calculadora)
    {
        calculadora.actualizarResultado(0);
        calculadora.setEstado(new EstadoInicial());
    }

    public void setValor(double unValor, Calculadora calculadora) {
        if (this.huboError(unValor))
            calculadora.setEstado(new EstadoError());
        else {
            calculadora.actualizarResultado(this.realizarCalculo(calculadora.getResultadoAcumulado(), unValor));
            calculadora.setEstado(new EstadoEsperandoOperando());

        }
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
        calculadora.setEstado(new EstadoError());
        return "Error";
    }

    protected abstract double realizarCalculo(double resultado, double unValor);

    protected abstract boolean huboError(double unValor);
}
