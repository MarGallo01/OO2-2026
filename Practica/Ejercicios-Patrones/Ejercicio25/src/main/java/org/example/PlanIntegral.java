package org.example;

import java.time.LocalDate;

public class PlanIntegral extends PlanMedico{
    public PlanIntegral(LocalDate fechaCreacion, double montoInicial, double cargoFamiliar, boolean seguroInternacion) {
        super(fechaCreacion, montoInicial, cargoFamiliar);
    }

    protected double calcularSeguroInternacion(double monto)
    {
        return monto + (this.getMontoInicial() * 0.05);
    }

    protected double basicoAdicional(Afiliado afiliado)
    {
        return 0;
    }

    protected double montoFamiliar(Afiliado afiliado)
    {
        return (this.getCargoFamiliar() * afiliado.getFamiliares()) + afiliado.porcentajeSalario(afiliado.getFamiliares());
    }

    protected double montoCobertura(Afiliado afiliado)
    {
        double monto = afiliado.porcentajeSalario(3);
        return afiliado.descontarAntiguedad(monto, 10000);
    }
}
