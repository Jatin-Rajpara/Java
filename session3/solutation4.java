package session3;

public class solutation4 {
    public static void main(String[] args) {
        
        int cartTotal = 450;
        if (cartTotal > 0) {
            if (cartTotal >= 500) {
                System.out.println("Free Delivery...");
            } else {
                System.out.println("Add more items for Free Delivery...");
            }
        } else {
            System.out.println("Cart is empty...");
        }

    }
}
