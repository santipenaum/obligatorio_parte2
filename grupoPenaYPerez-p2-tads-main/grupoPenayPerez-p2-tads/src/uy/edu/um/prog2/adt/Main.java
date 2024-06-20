package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.Hash.MyHashImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyHashImpl<String, Song> songs = new MyHashImpl<>();
        MyHashImpl<String, Artist> artists = new MyHashImpl<>();
        MyHashImpl<String, Country> countries = new MyHashImpl<>();

        CargaDeDatos cargaDeDatos = new CargaDeDatos();
        cargaDeDatos.cargaSongs(songs, artists, countries);

    }
}
