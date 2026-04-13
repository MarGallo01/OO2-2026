package org.example;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Itweet> tweets;

    public Usuario(String screen)
    {
        this.screenName = screen;
        this.tweets = new ArrayList<Itweet>();
    }

    public String getScreenName() {
        return this.screenName;
    }

    public List<Itweet> getTweets()
    {
        return this.tweets;
    }

    public void eliminarReTweetsAsociados(List<Itweet> borrados)
    {
        for(Itweet t : borrados)
        {
            this.tweets.removeIf(post -> post.esRetweetDe(t));
        }
    }

    public int cantidadDeTweets()
    {
        return this.tweets.size();
    }

    public void agregarTweet(Itweet t)
    {
        this.tweets.add(t);
    }
}