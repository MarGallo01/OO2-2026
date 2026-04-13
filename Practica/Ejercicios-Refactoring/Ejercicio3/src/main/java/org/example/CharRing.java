package org.example;

public class CharRing extends Ring{
    private char[] source;

    public CharRing(String src) {
        super(src.length());
        source = src.toCharArray();

    }

    public char next() {
       return source[devolverPosicion()];
    }

}
