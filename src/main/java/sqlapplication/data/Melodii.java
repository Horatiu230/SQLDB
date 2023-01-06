package sqlapplication.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Melodii")
public class Melodii {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "Artist_name")
    private String artist_name;
    @Column(name = "Song_name")
    private String song_name;
    @Column(name = "Album")
    private String album;
    @Column(name = "Year")
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;


    }

    @Override
    public String toString() {
        return "Melodii{" +
                "id=" + id +
                ", artist_name='" + artist_name + '\'' +
                ", song_name='" + song_name + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }
}




