package session11;

abstract class FoodOrder {

    abstract void placeOrder();

    abstract void cancelOrder();
}

class ZomatoOrder extends FoodOrder {

    void placeOrder() {
        System.out.println("Zomato order placed.");
    }

    void cancelOrder() {
        System.out.println("Zomato order cancelled.");
    }
}

class SwiggyOrder extends FoodOrder {

    void placeOrder() {
        System.out.println("Swiggy order placed.");
    }

    void cancelOrder() {
        System.out.println("Swiggy order cancelled.");
    }
}

interface PaymentService {

    void makePayment(double amount);

    void refundPayment(double amount);
}

class PaytmPayment implements PaymentService {

    public void makePayment(double amount) {
        System.out.println("Paytm Payment: " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Paytm Refund: " + amount);
    }
}

class PhonePePayment implements PaymentService {

    public void makePayment(double amount) {
        System.out.println("PhonePe Payment: " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("PhonePe Refund: " + amount);
    }
}

public class solutation5 {

    public static void main(String[] args) {

        FoodOrder order = new ZomatoOrder();
        order.placeOrder();
        order.cancelOrder();

        System.out.println();

        PaymentService payment = new PaytmPayment();
        payment.makePayment(900);
        payment.refundPayment(900);
    }
}
