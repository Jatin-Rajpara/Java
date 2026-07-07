package session15;

import java.io.FileInputStream;
import java.io.IOException;

public class solutation4 {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("cartlog.txt");

            int data;
            int count = 0;

            while ((data = fis.read()) != -1) {

                if ((char) data == '\n') {
                    count++;
                }
            }

            fis.close();

            System.out.println("Total Items Added: " + count);

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}