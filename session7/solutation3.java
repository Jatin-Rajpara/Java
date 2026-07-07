package session7;

public class solutation3 {

    String order = "";

    void addItem(String itemName) {
        order = order + itemName + " ";
    }

    void getOrderSummary() {
        System.out.println("Order Summary: " + order);
    }

    public static void main(String[] args) {

        solutation3 order = new solutation3();

        order.addItem("Pizza");
        order.addItem("Burger");
        order.addItem("Cold Drink");

        order.getOrderSummary();
    }
}