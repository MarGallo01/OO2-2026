package org.example;

public class Silver extends Membresia{
    protected BonoBajoRiesgo crearBonoBajo()
    {
        BonoBajoRiesgo bonoBajo = new BonoBajoRiesgo();
        bonoBajo.setParking(bonoBajo.getParkingSilver());;
        return bonoBajo;
    }

    protected PlazoFijo crearPlazoFijo()
    {
        PlazoFijo plazoFijo = new PlazoFijo();
        plazoFijo.setDias(plazoFijo.getDiasSilver());
        plazoFijo.setPlazo(plazoFijo.getInteresSilver());
        return plazoFijo;
    }

    @Override
    public ProductoFinanciero crearProducto3() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductoFinanciero crearProducto4() {
        // TODO Auto-generated method stub
        return null;
    }
}