package session14;

class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}

public class solutation1 {

    public static void checkStock(int availableStock, int requestedQuantity)
            throws OutOfStockException {

        if (requestedQuantity > availableStock) {
            throw new OutOfStockException(
                    "Requested quantity exceeds available stock.");
        }

        System.out.println("Product added to cart successfully.");
    }

    public static void main(String[] args) {

        try {

            checkStock(5, 8);

        } catch (OutOfStockException e) {

            System.out.println(e.getMessage());

        }
    }
}