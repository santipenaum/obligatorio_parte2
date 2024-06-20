package uy.edu.um.prog2.adt;
import uy.edu.um.prog2.adt.LinkedList.MyLinkedListImpl;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private MyLinkedListImpl<Song> songs;

    // Constructor
    public Artist(String name) {
        this.name = name;
        this.songs = new MyLinkedListImpl<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public MyLinkedListImpl<Song> getSongs() {
        return songs;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void addSong(Song song) {
        songs.add(song);
    }

}

