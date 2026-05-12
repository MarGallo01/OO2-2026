package org.example;

public class Atomo implements ElementoQuimico{

    private String nombre;
    private String simbolo;
    private int pesoAtomico;
    private int cargaTipica;
    private boolean esMetal;

    public Atomo(String nombre , String simbolo , int pesoAtomico , int cargaTipica , boolean esMetal){
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.pesoAtomico = pesoAtomico;
        this.cargaTipica = cargaTipica;
        this.esMetal = esMetal;
    }

    public String formula(){
        return this.simbolo;
    }

    public int pesoMolecular(){
        return this.pesoAtomico;
    }

    public int carga(){
        return this.cargaTipica;
    }

    /*
    public boolean esValida(){
        return true;
    }
    */

}
