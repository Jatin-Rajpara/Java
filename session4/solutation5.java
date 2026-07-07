package session4;

import java.util.ArrayList;

public class solutation5 {

    private String username;
    private String password;
    private double balance;

    ArrayList<String> transactionHistory = new ArrayList<>();

    public solutation5(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0;
    }

    public void addFunds(double amount) {
        balance += amount;
        transactionHistory.add("Added ₹" + amount);
    }

    public void spendFunds(double amount) {

        if (amount > balance) {
            System.out.println("Error: Insufficient Balance.");
            return;
        }

        balance -= amount;
        transactionHistory.add("Spent ₹" + amount);

        System.out.println("Updated Balance: ₹" + balance);
        System.out.println("Latest Transaction: "
                + transactionHistory.get(transactionHistory.size() - 1));
    }

    public static void main(String[] args) {

        solutation5 user = new solutation5("man123", "1234");

        user.addFunds(2000);

        user.spendFunds(500);

        user.spendFunds(2500);
    }
}   