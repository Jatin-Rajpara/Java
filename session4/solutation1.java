package session4;
import java.util.ArrayList;
public class solutation1 {

    private String username;
    private String password;
    private double balance;

    public solutation1(String username, String password) 
    {
    this.username = username;
    this.password = password;
    this.balance = 0;
    }

    public double getBalance() {
    return balance;
    }

    public void setBalance(double balance) {
    this.balance = balance;
    }


    public static void main(String[] args) {
        solutation1 user1 = new solutation1("user1", "password1");
        user1.setBalance(1000);
        System.out.println("Balance: ₹" + user1.getBalance());
    }
}
