package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.LinkedList.MyLinkedListImpl;

public class Country {
    private String name;
    private MyLinkedListImpl<Song> topSongs;

    public Country(String name) {
        this.name = name;
        this.topSongs = new MyLinkedListImpl<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyLinkedListImpl<Song> getTopSongs() {
        return topSongs;
    }

    public void addSong(Song song) {
        this.topSongs.add(song);
    }


}
