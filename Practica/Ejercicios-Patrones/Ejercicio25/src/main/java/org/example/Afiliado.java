package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Afiliado {
    private String nombre;
    private int familiaresACargo;
    private double salario;
    private LocalDate fechaNacimiento;
    private PlanMedico plan;
    private List<PlanMedico> previos;
    private ICoseguro coseguro;

    public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, PlanMedico plan) {
        this.nombre = nombre;
        this.familiaresACargo = familiaresACargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.previos = new ArrayList<PlanMedico>();
        this.plan = plan;
        this.coseguro = new SinCoseguro();
    }
    public void agregarCoseguro(ICoseguro coseguro)
    {
        this.coseguro = coseguro;
    }

    public void setPlanMedico(PlanMedico plan)
    {
        this.previos.add(this.plan);//Agrego el actual a los planes previos
        this.plan = plan;
    }

    public double descontarCoseguro(double monto)
    {
        return this.coseguro.realizarDescuento(monto);
    }

    protected int getFamiliares()
    {
        return this.familiaresACargo;
    }
    protected double porcentajeSalario(int cantidad)
    {
        return this.salario * (cantidad / 100.0);
    }

    protected double descontarViaje(double monto)
    {
        return this.coseguro.descontarViaje(monto);
    }

    protected double descontarAntiguedad(double monto, double descuento)
    {
        return this.coseguro.descontarAntiguedad(descuento);
    }
}
