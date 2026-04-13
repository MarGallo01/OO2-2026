package org.example;



public class IntRing extends Ring {
    private int[] source;

    public IntRing(int[]src){
        super(src.length);
        source = src;
    }

    public int next(){
        return source[devolverPosicion()];
    }
}
