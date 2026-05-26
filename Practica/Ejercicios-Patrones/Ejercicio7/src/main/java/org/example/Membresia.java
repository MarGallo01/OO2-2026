package org.example;

public abstract class Membresia {
    public ProductoFinanciero crearProducto1()
    {
        ProductoCombinado combo = new ProductoCombinado();
        combo.agregarProducto(new CompraDolares());
        combo.agregarProducto(this.crearPlazoFijo());
        combo.agregarProducto(new CompraPesos());
        return combo;
    }

    public ProductoFinanciero crearProducto2()
    {
        ProductoCombinado combo = new ProductoCombinado();
        combo.agregarProducto(this.crearBonoBajo());
        combo.agregarProducto(new CompraDolares());
        combo.agregarProducto(this.crearPlazoFijo());
        combo.agregarProducto(new CompraPesos());
        return combo;
    }

    protected abstract PlazoFijo crearPlazoFijo();
    protected abstract BonoBajoRiesgo crearBonoBajo();
    public abstract ProductoFinanciero crearProducto3();
    public abstract ProductoFinanciero crearProducto4();
}
