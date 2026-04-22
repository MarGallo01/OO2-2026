package org.example;

public class Tierra extends Topografia{

    public double proporcionAgua(){
        return 0;
    }
    public double proporcionTierra(){
        return 1;
    };

    public boolean igual(Topografia topografia){
        return this.equals(topografia);
    }
}
