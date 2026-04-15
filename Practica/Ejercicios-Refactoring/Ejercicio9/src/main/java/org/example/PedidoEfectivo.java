package org.example;

import java.util.List;

public class PedidoEfectivo extends Pedido{


    public PedidoEfectivo(Cliente cliente, List<Producto> productos, String formaPago) {
        super(cliente, productos, formaPago);
    }

    public double calcularExtra(){
        return 0;
    }
}
