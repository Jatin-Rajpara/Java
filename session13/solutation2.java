package session13;

import java.util.*;

public class solutation2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Wallet Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Purchase Amount: ");
            double purchase = sc.nextDouble();

            if (purchase > balance) {
                throw new Exception("Error: Purchase amount exceeds wallet balance.");
            }

            balance = balance - purchase;

            System.out.println("Purchase Successful.");
            System.out.println("Remaining Balance: " + balance);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();

        }
    }
}
