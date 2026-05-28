package org.example;

public class SinCoseguro implements ICoseguro{
    @Override
    public double realizarDescuento(double monto) {
        return monto;
    }

    @Override
    public double descontarViaje(double monto) {
        return monto;
    }

    @Override
    public double descontarAntiguedad(double descuento) {
        return 0;
    }
}
