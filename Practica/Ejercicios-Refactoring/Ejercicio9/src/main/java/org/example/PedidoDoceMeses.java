package org.example;

import java.util.List;

public class PedidoDoceMeses extends Pedido {

    public PedidoDoceMeses(Cliente cliente, List<Producto> productos, String formaPago) {
        super(cliente, productos, formaPago);
    }

    public double calcularExtra(){
        return 0.5;
    }
}
