package org.example;

public class ArmaduraAcero implements Armadura{
    @Override
    public int pelearContra(Arma arma) {
        return arma.pelearContraArmaduraAcero();
    }
}
