package session14;

class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class solutation3 {

    static void placeOrder(boolean available,
                           double walletBalance,
                           double orderAmount)
            throws OutOfStockException, InsufficientFundsException {

        if (orderAmount < 0) {
            throw new IllegalArgumentException(
                    "Order amount cannot be negative.");
        }

        if (!available) {
            throw new OutOfStockException(
                    "Sorry! The selected dish is unavailable.");
        }

        if (walletBalance < orderAmount) {
            throw new InsufficientFundsException(
                    "Insufficient wallet balance.");
        }

        System.out.println("Order Placed Successfully!");
    }

    public static void main(String[] args) {

        try {

            placeOrder(false, 500, 300);

        } catch (OutOfStockException e) {

            System.out.println(e.getMessage());

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }
    }
}