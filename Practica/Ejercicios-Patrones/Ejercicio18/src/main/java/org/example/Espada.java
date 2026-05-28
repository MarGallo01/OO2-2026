package org.example;

public class Espada extends Arma{
    public int pelearContraArmaduraCuero()
    {
        this.setDaño(8);
        return this.getDaño();
    }

    public int pelearContraArmaduraHierro()
    {
        this.setDaño(5);
        return this.getDaño();
    }

    public int pelearContraArmaduraAcero()
    {
        this.setDaño(3);
        return this.getDaño();
    }
}
