package uy.edu.um.prog2.adt;


import org.junit.Before;
import org.junit.Test;
import uy.edu.um.prog2.adt.Hash.MyHashImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TestCargaDeDatos {
    private MyHashImpl<String, Song> songs;
    private MyHashImpl<String, Artist> artists;
    private MyHashImpl<String, Country> countries;

    @Before
    public void setUp() {
        songs = new MyHashImpl<>();
        artists = new MyHashImpl<>();
        countries = new MyHashImpl<>();
    }

    @Test
    public void testCargaSongs() throws IOException {
        CargaDeDatos cargaDeDatos = new CargaDeDatos();



        cargaDeDatos.cargaSongs(songs, artists, countries);

        // Verificar que se haya cargado al menos una canción
        assertEquals(748803, songs.size());  // Ajusta el número según la cantidad de canciones en tu archivo

        // Verificar que una canción específica se haya cargado correctamente
        Song cancionA = songs.get("7fzHQizxTqy8wTXwlrgPQQ");
        assertNotNull(cancionA);
        assertEquals("MILLION DOLLAR BABY", cancionA.getTitle());
        assertEquals("Tommy Richman", cancionA.getArtist());
        assertEquals(1, cancionA.getPosition());
        assertEquals("", cancionA.getCountry());
        assertEquals(LocalDate.parse("2024-05-13", DateTimeFormatter.ofPattern("yyyy-MM-dd")), cancionA.getDate());
        assertEquals(138.003, cancionA.getTempo());


        // Puedes agregar más aserciones para verificar otras canciones si es necesario
    }
}

