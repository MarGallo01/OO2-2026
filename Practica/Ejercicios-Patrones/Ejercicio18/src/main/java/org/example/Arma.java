package org.example;

public abstract class Arma {
    private int daño;

    protected void setDaño(int daño)
    {
        this.daño = daño;
    }

    protected int getDaño()
    {
        return this.daño;
    }

    public abstract int pelearContraArmaduraCuero();
    public abstract int pelearContraArmaduraHierro();
    public abstract int pelearContraArmaduraAcero();
}
