package session6;

public class solutation2 {

    String playlistName;
    int totalSongs;


    void displayInfo() {
        System.out.println("Playlist Name : " + playlistName);
        System.out.println("Total Songs : " + totalSongs);
    }

    public static void main(String[] args) {

    
        solutation2 p = new solutation2();

        p.playlistName = "My Favorite Songs";
        p.totalSongs = 25;

        p.displayInfo();
    }
}