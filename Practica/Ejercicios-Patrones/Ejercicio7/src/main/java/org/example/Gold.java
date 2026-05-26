package org.example;

public class Gold extends Membresia{
    protected BonoBajoRiesgo crearBonoBajo()
    {
        BonoBajoRiesgo bonoBajo = new BonoBajoRiesgo();
        bonoBajo.setParking(bonoBajo.getParkingGold());
        return bonoBajo;
    }

    private BonoAltoRiesgo crearBonoAlto()
    {
        BonoAltoRiesgo bonoAlto = new BonoAltoRiesgo();
        bonoAlto.setParking(bonoAlto.getParkingGold());
        return bonoAlto;
    }

    protected PlazoFijo crearPlazoFijo()
    {
        PlazoFijo plazoFijo = new PlazoFijo();
        plazoFijo.setDias(plazoFijo.getDiasGold());
        plazoFijo.setPlazo(plazoFijo.getInteresGold());
        return plazoFijo;
    }

    public ProductoFinanciero crearProducto3()
    {
        ProductoCombinado combo = new ProductoCombinado();
        combo.agregarProducto(crearBonoAlto());
        combo.agregarProducto(crearBonoAlto());
        combo.agregarProducto(this.crearPlazoFijo());
        return combo;
    }

    public ProductoFinanciero crearProducto4()
    {
        ProductoCombinado combo = new ProductoCombinado();
        combo.agregarProducto(crearBonoAlto());
        combo.agregarProducto(crearBonoAlto());
        combo.agregarProducto(crearBonoAlto());
        return combo;
    }
}
