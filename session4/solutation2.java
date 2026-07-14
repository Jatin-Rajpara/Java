package session4;

import java.util.ArrayList;

class UserAccount {
    private String username;
    private String pass;
    private double balance;

    public UserAccount(String username, String pass) {
        this.username = username;
        this.pass = pass;
        this.balance = 0;
    }

    public String getUsername() {
        return username;
    }
}

public class solutation2 {

    static ArrayList<UserAccount> users = new ArrayList<UserAccount>();

    public static void register(UserAccount user) {
        
       
        for (int i = 0; i < users.size(); i++) {
            UserAccount u = users.get(i);
            if (u.getUsername().equals(user.getUsername())) {
                System.out.println("Username already exists.");
                return; 
            }
        }

        users.add(user);
        System.out.println("Registration Successful.");
    }

    public static void main(String[] args) {

        register(new UserAccount("ketan", "9865"));
        register(new UserAccount("rahul", "3333"));
        register(new UserAccount("rohan", "4399"));

    }
}
