package session9;

class Song {

    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void displaySong() {
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
    }
}

public class solutation1 extends Song {

    boolean lyricsAccess;

    solutation1(String title, String artist, boolean lyricsAccess) {
        super(title, artist);
        this.lyricsAccess = lyricsAccess;
    }

    void displayPremium() {
        displaySong();
        System.out.println("Lyrics Access : " + lyricsAccess);
    }

    public static void main(String[] args) {

        solutation1 song = new solutation1("Perfect", "Ed Sheeran", true);

        song.displayPremium();
    }
}
