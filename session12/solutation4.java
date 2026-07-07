package session12;

public class solutation4 {

    public static void main(String[] args) {

        String message = "Hello! This is a very long WhatsApp message that should be shortened before displaying.";

        if (message.length() > 30) {
            System.out.println(message.substring(0, 30) + "...");
        } else {
            System.out.println(message);
        }
    }
}