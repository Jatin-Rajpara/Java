package session4;

import java.util.ArrayList;

class LoginUserAccount {

    private String username;
    private String password;

    public Loginac(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class solutation3 {

    static ArrayList<Loginac> users = new ArrayList<>();

    public static void login(String username, String password) {

        for (Loginac user : users) {

            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                System.out.println("Login successful");
                return;
            }
        }

        System.out.println("Invalid credentials");
    }

    public static void main(String[] args) {

        users.add(new LoginUserAccount("rahu", "176234"));
        users.add(new LoginUserAccount("iqakbal", "771"));

        login("rahu", "176234");
        login("iqakbal", "771");
    }
}
