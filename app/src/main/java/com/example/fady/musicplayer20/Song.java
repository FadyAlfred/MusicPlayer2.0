package com.example.fady.musicplayer20;

/**
 * Created by Fady on 11/3/2016.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}



    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }
}
