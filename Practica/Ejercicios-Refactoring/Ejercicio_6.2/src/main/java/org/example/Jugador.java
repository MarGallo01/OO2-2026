package org.example;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }

    public void incrementar(int valor){
        this.puntuacion+= valor;
    }

    public void decrementar(int valor){
        this.puntuacion-= valor;
    }

}

/*
Malos olores detectados

-Public field -- se arregla usando self encapsulated field

- Envidia de atributos en juego - uso move method


 */