package org.example;

public class Martillo extends Arma{
    @Override
    public int pelearContraArmaduraCuero() {
        this.setDaño(6);
        return this.getDaño();
    }

    @Override
    public int pelearContraArmaduraHierro() {
        this.setDaño(4);
        return this.getDaño();
    }

    @Override
    public int pelearContraArmaduraAcero() {
        this.setDaño(3);
        return this.getDaño();
    }

}
