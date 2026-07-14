package session7;

public class solutation1 {

    int songCount = 0;

    void addSong() {
        songCount++;
        System.out.println("Song added to playlist");
    }

    void check() {
        System.out.println("Total Songs Added: " + songCount);
    }

    public static void main(String[] args) {

        solutation1 p = new solutation1();

        p.addSong();
        p.addSong();
        p.addSong();

        p.check();
    }
}
