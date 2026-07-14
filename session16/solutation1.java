package session16;

import java.util.ArrayList;

class Song {

    String title;
    String artist;
    int duration;

    Song(String title, String artist, int duration) {

        this.title = title;
        this.artist = artist;
        this.duration = duration;

    }

    void display() {

        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
        System.out.println("Duration : " + duration + " sec");
        System.out.println();

    }
}

public class solutation1 {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<Song>();
        
        songs.add(new Song("Tum Hi Ho", "Arijit Singh", 262));
        songs.add(new Song("Stay", "Justin Bieber", 141));
        songs.add(new Song("Despacito", "Luis Fonsi", 228));
        songs.add(new Song("Dynamite", "BTS", 199));
        songs.add(new Song("Kesariya", "Arijit Singh", 268));

        for (Song s : songs) {

            s.display();

        }
    }
}
