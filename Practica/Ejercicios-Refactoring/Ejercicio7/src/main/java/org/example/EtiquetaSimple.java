package org.example;

public class EtiquetaSimple extends Etiqueta {
    public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    public void imprimirNombre(){
        System.out.println("--- ETIQUETA SIMPLE ---");
    }

    public void imprimirPrecio(){
        System.out.println("Precio: $" + precio);
    }

}
