package org.example;

public class ArmaduraCuero implements Armadura{
    @Override
    public int pelearContra(Arma arma) {
        return arma.pelearContraArmaduraCuero();
    }
}
