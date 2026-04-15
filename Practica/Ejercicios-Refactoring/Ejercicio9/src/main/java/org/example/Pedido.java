package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private String formaPago;
    public Pedido(Cliente cliente, List<Producto> productos, String formaPago) {
        if (!"efectivo".equals(formaPago)  && !"6 cuotas".equals(formaPago)  && !"12 cuotas".equals(formaPago)) {
            throw new Error("Forma de pago incorrecta");
        }
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }

    public abstract double calcularExtra();

    public double getCostoTotal() {
        double costoProductos = this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
        double extraFormaPago = costoProductos * calcularExtra();

        int añosDesdeFechaAlta = cantidadDias();


        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad
        if (añosDesdeFechaAlta > 5) {
            return (costoProductos + extraFormaPago) * 0.9;
        }
        return costoProductos + extraFormaPago;
    }

    public int cantidadDias(){
        return this.cliente.calcularCantidadDias();
    }
}
