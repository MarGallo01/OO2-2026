package org.example;

import java.text.MessageFormat;

public class Supermercado {

    public void notificarPedido(long nroPedido , Cliente cliente){
        String notificacion = crearNotificacion(nroPedido , cliente);
        System.out.println(notificacion);
    }

    public String crearNotificacion(long nroPedido , Cliente cliente){
        return MessageFormat.format("Estimado cliente, se le informa que hemos recibido su pedido con numero {0}, el cual sera enviado a la direccion {1}",new Object[]{nroPedido,cliente.getDireccionFormateada()});
    }
}


