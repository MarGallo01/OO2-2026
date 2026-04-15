package org.example;

public class EtiquetaDetalle  extends Etiqueta{
    public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }

    public void imprimirNombre(){
        System.out.println("--- ETIQUETA DETALLE ---");
    }

    public void imprimirPrecio(){
        System.out.println("Precio sin imp.: $" + (precio * 0.79));
        System.out.println("Precio final: $" + precio);
    }

}
