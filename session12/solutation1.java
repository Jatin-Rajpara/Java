package session12;

public class solutation1 {

    public static void main(String[] args) {

        String username = "insta_rockstar123";
        String masked = "";

        for (int i = 0; i < username.length() - 4; i++) {
            masked += "*";
        }

        masked += username.substring(username.length() - 4);

        System.out.println("Original Username : " + username);
        System.out.println("Masked Username   : " + masked);
    }
}