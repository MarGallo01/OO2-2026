package org.example;

import java.time.LocalDate;

public class PlanObligatorio extends PlanMedico {
    public PlanObligatorio(LocalDate fechaCreacion, double montoInicial, double cargoFamiliar) {
        super(fechaCreacion, montoInicial, cargoFamiliar);
    }

    protected double calcularSeguroInternacion(double monto)
    {
        return monto;
    }

    protected double basicoAdicional(Afiliado afiliado)
    {
        return 0;
    }

    protected double montoFamiliar(Afiliado afiliado)
    {
        double monto = this.getCargoFamiliar() * afiliado.getFamiliares();
        return afiliado.descontarCoseguro(monto);
    }

    protected double montoCobertura(Afiliado afiliado)
    {
        double monto = afiliado.porcentajeSalario(1);
        return afiliado.descontarViaje(monto);
    }
}
