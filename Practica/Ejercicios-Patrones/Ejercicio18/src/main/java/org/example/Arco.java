package org.example;

public class Arco extends Arma{
    public int pelearContraArmaduraCuero()
    {
        this.setDaño(5);
        return this.getDaño();
    }

    public int pelearContraArmaduraHierro()
    {
        this.setDaño(3);
        return this.getDaño();
    }

    public int pelearContraArmaduraAcero()
    {
        this.setDaño(2);
        return this.getDaño();
    }
}
