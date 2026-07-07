package session4;

import java.util.ArrayList;

class LoginUserAccount {

    private String username;
    private String password;

    public LoginUserAccount(String username, String password) {
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

    static ArrayList<LoginUserAccount> users = new ArrayList<>();

    public static void login(String username, String password) {

        for (LoginUserAccount user : users) {

            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {

                System.out.println("Login successful");
                return;
            }
        }

        System.out.println("Invalid credentials");
    }

    public static void main(String[] args) {

        users.add(new LoginUserAccount("man123", "1234"));
        users.add(new LoginUserAccount("rahul", "1111"));

        login("man123", "1234");
        login("man123", "9999");
    }
}