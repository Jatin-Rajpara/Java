package session8;

public class solutation3 {

    int productId;
    int quantity;

    solutation3(int productId) {
        this.productId = productId;
        this.quantity = 1;
    }

    solutation3(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    solutation3(solutation3 item) {
        this.productId = item.productId;
        this.quantity = item.quantity;
    }

    void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Quantity : " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {

        solutation3 item1 = new solutation3(101);
        solutation3 item2 = new solutation3(102, 3);
        solutation3 item3 = new solutation3(item2);

        item1.display();
        item2.display();
        item3.display();
    }
}