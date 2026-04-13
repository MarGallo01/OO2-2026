package org.example;

//extract superclass por tener comportamiento comun y codigo repetido
//extract method logica de posicion o indice
//move method para subir a la superclase


public class Ring {
    private int idx;
    private int cantElementos;

    public Ring(int cantidad){
        this.idx = 0;
        this.cantElementos = cantidad;
    }

    public int devolverPosicion(){
        if(this.idx >= cantElementos){
            idx = 0;
        }
        return this.idx++;
    }
}
