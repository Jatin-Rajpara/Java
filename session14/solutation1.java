package session14;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}
public class solutation1 {

    public static void checkStock(int stock, int qty) throws OutOfStockException {
     
        if (qty > stock) {
            throw new OutOfStockException("Requested quantity exceeds available stock.");
        }

        System.out.println("Product added to cart successfully.");
    }

    public static void main(String[] args) {
        try {
           
            checkStock(5, 8);
        } catch (OutOfStockException e) {
           
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
