package org.example;

import java.util.LinkedList;
import java.util.List;

public class ProductoCombinado implements ProductoFinanciero{

    private List<ProductoFinanciero> productos;

    public ProductoCombinado()
    {
        this.productos = new LinkedList<ProductoFinanciero>();
    }

    public void agregarProducto(ProductoFinanciero p)
    {
        this.productos.add(p);
    }

    public double retornoInversion(double monto)
    {
        return this.productos.stream().mapToDouble(p -> p.retornoInversion(monto)).sum();
    }

}
