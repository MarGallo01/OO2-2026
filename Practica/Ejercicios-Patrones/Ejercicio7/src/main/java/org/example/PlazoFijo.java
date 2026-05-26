package org.example;

public class PlazoFijo implements ProductoFinanciero{
    private double plazo;
    private int duracionEnDias;

    public PlazoFijo()
    {

    }

    public PlazoFijo(double plazo, int duracionEnDias) {
        this.plazo = plazo;
        this.duracionEnDias = duracionEnDias;
    }

    @Override
    public double retornoInversion(double monto) {
        // TODO Auto-generated method stub
        return monto + (monto * plazo);
    }

    protected void setPlazo(double plazo)
    {
        this.plazo = plazo;
    }

    protected void setDias(int dias)
    {
        this.duracionEnDias = dias;
    }

    protected int getDiasSilver()
    {
        return 35;
    }

    protected int getDiasGold()
    {
        return 30;
    }

    protected double getInteresSilver()
    {
        return 0.05;
    }

    protected double getInteresGold()
    {
        return 0.06;
    }
}
