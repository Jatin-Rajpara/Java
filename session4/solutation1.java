package session4;
import java.util.ArrayList;
public class solutation1 {

    private String username;
    private String pass;
    private double balance;

    public solutation1(String username, String pass) 
    {
    this.username = username;
    this.pass = pass;
    this.balance = 0;
    }

    public double getBalance() {
    return balance;
    }

    public void setBalance(double balance) {
    this.balance = balance;
    }


    public static void main(String[] args) {
        solutation1 user1 = new solutation1("Jatin", "ztx4a");
        user1.setBalance(90000);
        System.out.println("Balance: ₹" + user1.getBalance());
    }
}
