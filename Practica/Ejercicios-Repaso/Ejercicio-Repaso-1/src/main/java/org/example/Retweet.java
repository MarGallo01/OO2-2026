package org.example;

public class Retweet implements Itweet{
    private Tweet tweet;

    public Retweet(Tweet tweet)
    {
        this.tweet = tweet;
    }

    public String getTexto()
    {
        return this.tweet.getTexto();
    }

    public boolean esRetweetDe(Itweet unTweet) {
        return this.tweet.equals(unTweet);
    }
}
