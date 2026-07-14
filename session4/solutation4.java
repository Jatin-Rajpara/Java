package session4;

import java.util.ArrayList;

public class solutation4 {

    private String username;
    private String password;
    private double balance;

    ArrayList<String> transach = new ArrayList<>();

    public solutation4(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public void addFunds(double amount) {
        balance += amount;

        transach.add("Added ₹" + amount);

        System.out.println("Updated Balance: ₹" + balance);

        System.out.println("Latest Transaction: "
                + transach.get(transach.size() - 1));
    }

    public static void main(String[] args) {

        solutation4 user = new solutation4("roman", "23434");

        user.addFunds(500);

        user.addFunds(1000);
    }
}
