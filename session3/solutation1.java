package session3;
import java.util.Scanner;
public class solutation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Wallet Balance: ");
        int balance = sc.nextInt();
            if (balance < 100) {
        System.out.println("Low Balance Warning.");
        } else {
        System.out.println("Sufficient Balance.");
    }   }
    
}
