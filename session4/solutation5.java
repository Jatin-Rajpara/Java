package session4;

import java.util.ArrayList;

public class solutation5 {

    private String username;
    private String pass;
    private double balance;

    ArrayList<String> trh = new ArrayList<>();

    public solutation5(String username, String pass) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public void addFunds(double amount) {
        balance += amount;
       trh.add("Added ₹" + amount);
    }

    public void spendFunds(double amount) {

        if (amount > balance) {
            System.out.println("Error: Insufficient Balance.");
            return;
        }

        balance -= amount;
        trh.add("Spent ₹" + amount);

        System.out.println("Updated Balance: ₹" + balance);
        System.out.println("Latest Transaction: "
                + trh.get(trh.size() - 1));
    }

    public static void main(String[] args) {

        solutation5 user = new solutation5("man987", "1234");

        user.addFunds(20000);

        user.spendFunds(800);

        user.spendFunds(8500);
    }
}   
