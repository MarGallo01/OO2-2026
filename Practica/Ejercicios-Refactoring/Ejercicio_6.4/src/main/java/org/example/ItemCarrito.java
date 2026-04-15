package org.example;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
    public Producto getProducto() {
        return this.producto;
    }
    public int getCantidad() {
        return this.cantidad;
    }

    public double calcularTotal(){
        return (this.cantidad * this.producto.getPrecio());
    }
}
