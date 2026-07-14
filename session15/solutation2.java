package session15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class solutation2 {

    public static void main(String[] args) {

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("playlist.txt"));

            String line;
            int lineno = 1;

            while ((line = reader.readLine()) != null) {

                System.out.println(lineno + ". " + line);
                lineno++;

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
