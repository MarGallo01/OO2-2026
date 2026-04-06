package org.example;
import java.util.LinkedList;

public class Usuario {
    private LinkedList<Tweet> tweets;
    private String screenName;

    public Usuario (String nombre){
        this.screenName = nombre;
    }
    public void postearTweet (String texto){

    }
    public String getScreenName (){
        return this.screenName;
    }

    public void retwittear(Tweet tweet){

    }
}
