package session2;
import java.util.Scanner;
public class solutation2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter wallet balance: ₹");
        
        double balance = sc.nextDouble();
        double cashback = 0;
        if (balance > 500) {
        cashback = balance * 0.10;
        }
        double finalBalance = balance + cashback;

        System.out.println("Cashback : ₹" + cashback);
        System.out.println("Final Balance : ₹" + finalBalance);


    }
}
