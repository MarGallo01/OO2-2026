package org.example;

public abstract class Etiqueta {
    protected String nombreProducto;
    protected double precio;

    public Etiqueta(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precio = precio;
    }

    public abstract void imprimirNombre();
    public abstract void imprimirPrecio();

    public void generar() {
        imprimirNombre();
        System.out.println("Producto: " + nombreProducto);
        imprimirPrecio();
        System.out.println("-----------------------");
    }


}

/*

--Codigo duplicado en etiquetas , simple 9 y 11 -- detalle 9 y 12
-- No se puede realizar pull method, puesto que una de las condiciones para aplicarlo es que los metodos deben ser identicos

--uso un extract method y luego un pull up


 */
