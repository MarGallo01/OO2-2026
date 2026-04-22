package org.example;

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
    private List<Media> media;

    public MediaPlayer(){
        this.media = new LinkedList<Media>();
    }

    public void addMedia(Media media){
        this.media.add(media);
    }

    public void play(){
        this.media.stream().forEach(media->media.play());
    }
}
