package session14;

import java.util.Scanner;


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class PaymentHandler {

    static double balance = 1000;
    static void processPayment(String amountText) throws InsufficientFundsException {
        
        double amt = Double.parseDouble(amountText);

        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient wallet balance.");
        }

        balance -= amt;

        System.out.println("Payment Successful.");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Payment Amount: ");
            String input = sc.nextLine();

            processPayment(input);

        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric amount.");
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } 
       
        catch (Exception e) {
            System.out.println("Unexpected Error occurred.");
        } 
 
        finally {
            sc.close();
        }
    }
}
