package org.example;

import java.util.List;

public class Mixta extends Topografia{
    private List<Topografia> topografias;

    public double proporcionAgua(){
        return (this.topografias.stream().mapToDouble(topografia -> topografia.proporcionAgua()).sum())/4;
    }
    public double proporcionTierra(){
        return 1 - this.proporcionAgua();
    };

    public boolean igual(Topografia topografia){
        return topografia.igualMixta(this);
    }

    public void addComponent(Topografia topografia){
        if(this.topografias.size() < 4){
            this.topografias.add(topografia);
        }
    }
    public void removeComponent(Topografia topografia){
        this.topografias.remove(topografia);
    }
}
