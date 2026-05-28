package org.example;

public class Baston extends Arma{
    public int pelearContraArmaduraCuero()
    {
        this.setDaño(2);
        return this.getDaño();
    }

    public int pelearContraArmaduraHierro()
    {
        this.setDaño(1);
        return this.getDaño();
    }

    public int pelearContraArmaduraAcero()
    {
        this.setDaño(1);
        return this.getDaño();
    }
}
