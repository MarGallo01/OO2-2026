package org.example;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;
    /*

    public double total() {
        return this.items.stream()
                .mapToDouble(item ->
                        item.getProducto().getPrecio() * item.getCantidad())
                .sum();
    }
     */

    public double total(){
        return this.items.stream().mapToDouble(item -> item.calcularTotal()).sum();
    }
}
/*
Code smells
-- Envidia de atributos -- lo soluciono usando move method


 */
