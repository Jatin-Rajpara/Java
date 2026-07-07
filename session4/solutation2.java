package session4;

import java.util.ArrayList;

class UserAccount {
    private String username;
    private String password;
    private double balance;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public String getUsername() {
        return username;
    }
}

public class solutation2 {

    static ArrayList<UserAccount> users = new ArrayList<UserAccount>();

    public static void register(UserAccount user) {

        for (UserAccount u : users) {
            if (u.getUsername().equals(user.getUsername())) {
                System.out.println("Username already exists.");
                return;
            }
        }

        users.add(user);
        System.out.println("Registration Successful.");
    }

    public static void main(String[] args) {

        register(new UserAccount("man123", "1234"));
        register(new UserAccount("rahul", "1111"));
        register(new UserAccount("man123", "9999"));

    }
}
