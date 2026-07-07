package session14;

public class solutation4 {

    static class InsufficientFundsException extends Exception {

        public InsufficientFundsException() {
            super("Insufficient balance to book the ticket.");
        }
    }

    public static void main(String[] args) {

        try {

            int userBalance = 100;
            int ticketPrice = 150;

            if (userBalance < ticketPrice) {
                throw new InsufficientFundsException();
            }

            System.out.println("Booking successful!");

        } catch (InsufficientFundsException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}