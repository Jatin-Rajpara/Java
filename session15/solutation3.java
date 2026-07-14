package session15;

import java.io.FileOutputStream;
import java.io.IOException;

public class solutation3 {

    public static void addToCart(String item) {

        try {

            FileOutputStream fos = new FileOutputStream("cartlog.txt", true);

            String text = "Added: " + item + "\n";

            fos.write(text.getBytes());

            fos.close();

            System.out.println("Item added...");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    public static void main(String[] args) {

        addToCart("iPhone - 12999");
        addToCart("Beta Headphones - 1499");
        addToCart("Samsung Charger - 899");

    }
}
