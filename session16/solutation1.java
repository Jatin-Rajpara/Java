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

        songs.add(new Song("Perfect", "Ed Sheeran", 263));
        songs.add(new Song("Believer", "Imagine Dragons", 204));
        songs.add(new Song("Levitating", "Dua Lipa", 203));
        songs.add(new Song("Blinding Lights", "The Weeknd", 200));
        songs.add(new Song("Shape of You", "Ed Sheeran", 233));

        for (Song s : songs) {

            s.display();

        }
    }
}