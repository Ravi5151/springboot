package com.example.song;

import java.util.*;

public class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId(){
        return songId;
    }
    public void setSongId(int songId){
        this.songId = songId;
    }
    public String getSongName(){
        return songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getLyricst(){
        return lyricist;
    }
    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }
    public String getSinger(){
        return singer;
    }
    public void setSinger(String singer){
        this.singer = singer;
    }
    public String getMusicDirector(){
        return this.musicDirector;
    }
    public void setMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }

}