package uy.edu.um.prog2.adt;

import uy.edu.um.prog2.adt.Hash.MyHashImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CargaDeDatos {
    private BufferedReader br = null;
    //private String songsFile = "\"C:\\Users\\59892\\OneDrive\\Desktop\\universal_top_spotify_songs.csv\"";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void cargaSongs( MyHashImpl<String, Song> songs, MyHashImpl<String, Artist> artists, MyHashImpl<String, Country> countries) throws IOException {
        String songsFile = "\"C:\\Users\\59892\\OneDrive\\Desktop\\universal_top_spotify_songs.csv\"";
        try (BufferedReader br = new BufferedReader(new FileReader(songsFile))) {
            String line = br.readLine();  // Leer la primera línea (posiblemente encabezados)
            line = br.readLine();  // Saltar la línea de encabezados


            while (line != null) {
                String[] datos = identificadorDeComas(line);


                    // Crear objeto Song con los datos obtenidos
                Song cancion = new Song(
                        datos[0],  // spotify_id
                        datos[1],   // name
                        Integer.parseInt(datos[2]),   // daily_rank
                        datos[6],   // country
                        LocalDate.parse(datos[7], DATE_FORMATTER),  // snapshot_date
                        Double.parseDouble(datos[24]), // tempo convertido a double
                        Integer.parseInt(datos[5])    // previous_position_change
                );

                // Almacenar la canción en la estructura de datos songs
                songs.put(datos[0], cancion);  // Usar spotify_id como clave única

                // Asociar la canción con el artista
                Artist artista = artists.get(datos[1]);
                if (artista == null) {
                    artista = new Artist(datos[1]);
                    artists.put(datos[1], artista);
                }
                artista.addSong(cancion);

                // Asociar la canción con el país
                Country pais = countries.get(datos[3]);
                if (pais == null) {
                    pais = new Country(datos[3]);
                    countries.put(datos[3], pais);
                }
                pais.addSong(cancion);

                line = br.readLine();  // Leer la siguiente línea
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los datos de canciones: " + e.getMessage());
        }
    }

    // Método para separar los datos por comas
    private String[] identificadorDeComas(String line) {
        return line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
    }
}
