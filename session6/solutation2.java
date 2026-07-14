package session6;

public class solutation2 {

    String playlistName;
    int Songs;


    void displayInfo() {
        System.out.println("Playlist Name : " + playlistName);
        System.out.println("Total Songs : " + Songs);
    }

    public static void main(String[] args) {

    
        solutation2 p = new solutation2();

        p.playlistName = "My Fav Songs";
        p.totalSongs = 45;

        p.displayInfo();
    }
}
