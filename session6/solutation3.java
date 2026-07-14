package session6;

public class solutation3 {

    
    String itemName;
    int quantity;

    
    void increaseq() {
        quantity++;
        System.out.println("Updated Quantity : " + quantity);
    }

    public static void main(String[] args) {

    
        solutation3 item = new solutation3();

    
        item.itemName = "Bluetooth Speaker";
        item.quantity = 3;

    
        System.out.println("Item Name : " + item.itemName);
        System.out.println("Initial Quantity : " + item.quantity);

        
        item.increaseq();
        item.increaseq();
    }
}
