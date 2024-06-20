package uy.edu.um.prog2.adt;
import java.time.LocalDate;

public class Song {
    private String title;
    private String artist;
    private int position;
    private String country;
    private LocalDate date;
    private double tempo;
    private int previousPositionChange;

    // Constructor
    public Song(String title, String artist, int position, String country, LocalDate date, double tempo, int previousPositionChange) {
        this.title = title;
        this.artist = artist;
        this.position = position;
        this.country = country;
        this.date = date;
        this.tempo = tempo;
        this.previousPositionChange = previousPositionChange;
    }

    // Getters y Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPreviousPositionChange() {
        return previousPositionChange;
    }

    public void setPreviousPositionChange(int previousPositionChange) {
        this.previousPositionChange = previousPositionChange;
    }

}
