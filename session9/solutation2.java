package session9;

class FoodOrder {

    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    double calculateTotal() {
        return amount;
    }
}

public class solutation2 extends FoodOrder {

    solutation2(double amount) {
        super(amount);
    }

    @Override
    double calculateTotal() {
        double total = super.calculateTotal();
        return total - (total * 0.10);
    }

    public static void main(String[] args) {

        solutation2 order = new solutation2(1000);

        System.out.println("Final Amount : " + order.calculateTotal());
    }
}