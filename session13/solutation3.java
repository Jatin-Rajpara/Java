package session13;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class solutation3 {

    static int balance = 7000;

    static void sendMoney(int amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds!");
        }

        balance = balance - amount;

        System.out.println("Money Sent Successfully.");
        System.out.println("Remaining Balance: " + balance);
    }

    public static void main(String[] args) {

        try {

            sendMoney(4000);
            sendMoney(9000);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());

        }
    }
}
