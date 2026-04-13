package org.example;

public class Tweet implements Itweet{
    private String texto;

    public Tweet(String texto) {
        if (texto.length() < 1 || texto.length() > 280) {
            throw new IllegalArgumentException("El tweet debe tener entre 1 y 280 caracteres.");
        }
        this.texto = texto;
    }

    public String getTexto()
    {
        return this.texto;
    }

    public boolean esRetweetDe(Itweet unTweet) {
        return false;
    }
}
