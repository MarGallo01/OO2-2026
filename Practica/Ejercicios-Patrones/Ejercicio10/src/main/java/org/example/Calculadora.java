package org.example;

public class Calculadora {
    private double resultadoAcumulado;
    private Estado estadoActual;

    public Calculadora()
    {
        this.resultadoAcumulado = 0;
        this.estadoActual = new EstadoInicial();
    }

    public String getResultado()
    {
        return this.estadoActual.resultado(this);
    }

    public void setEstado(Estado estado)
    {
        this.estadoActual = estado;
    }

    public void borrar()
    {
        this.estadoActual.borrar(this);
    }

    public void setValor(double unValor)
    {
        this.estadoActual.setValor(unValor, this);
    }

    public void mas()
    {
        this.estadoActual.mas(this);
    }

    public void menos()
    {
        this.estadoActual.menos(this);
    }

    public void por()
    {
        this.estadoActual.por(this);
    }

    public void dividido()
    {
        this.estadoActual.dividido(this);
    }

    protected void actualizarResultado(double unValor)
    {
        this.resultadoAcumulado = unValor;
    }

    protected double getResultadoAcumulado()
    {
        return this.resultadoAcumulado;
    }
}
