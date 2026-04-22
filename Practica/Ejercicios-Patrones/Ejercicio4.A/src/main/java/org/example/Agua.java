package org.example;

public class Agua extends Topografia{

    public double proporcionAgua(){
        return 1;
    }
    public double proporcionTierra(){
        return 0;
    };
    public boolean igual(Topografia topografia){
        return this.equals(topografia);
    }
}
