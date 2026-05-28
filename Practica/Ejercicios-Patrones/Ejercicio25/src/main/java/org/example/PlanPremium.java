package org.example;

import java.time.LocalDate;

public class PlanPremium extends PlanMedico{
    public PlanPremium(LocalDate fechaCreacion, double montoInicial, double cargoFamiliar, boolean seguroInternacion) {
        super(fechaCreacion, montoInicial, cargoFamiliar);
        // TODO Auto-generated constructor stub
    }

    protected double calcularSeguroInternacion(double monto)
    {
        return monto + (this.getMontoInicial() * 0.05);
    }

    protected double basicoAdicional(Afiliado afiliado)
    {
        return afiliado.descontarCoseguro(this.getMontoInicial()) - this.getMontoInicial();
    }

    protected double montoFamiliar(Afiliado afiliado)
    {
        double monto = 0;
        if(afiliado.getFamiliares() > 4)
            monto = this.getCargoFamiliar() * (afiliado.getFamiliares() - 4);
        return monto;
    }
    protected double montoCobertura(Afiliado afiliado)
    {
        double monto = afiliado.porcentajeSalario(1);
        return afiliado.descontarViaje(monto);
    }

}
