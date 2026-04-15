package org.example;

import java.util.List;

public class PedidoSeisMeses extends Pedido{

    public PedidoSeisMeses(Cliente cliente, List<Producto> productos, String formaPago) {
        super(cliente, productos, formaPago);
    }

    public double calcularExtra(){
       return 0.2;
    }
}
