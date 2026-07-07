package session15;

import java.io.FileWriter;
import java.io.IOException;

public class solutation1 {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("playlist.txt");

            writer.write("Blinding Lights\n");
            writer.write("Perfect\n");
            writer.write("Believer\n");
            writer.write("Shape of You\n");
            writer.write("Levitating\n");

            writer.close();

            System.out.println("Songs written successfully to playlist.txt");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}