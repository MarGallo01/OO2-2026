package org.example;

public class ArmaduraHierro implements Armadura{
    @Override
    public int pelearContra(Arma arma) {
        return arma.pelearContraArmaduraHierro();
    }
}
