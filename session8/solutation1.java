package session8;

public class solutation1 {

    String name;
    double price;

    solutation1() {
        name = "Unknown Product";
        price = 0.0;
    }

    solutation1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    solutation1(solutation1 p) {
        this.name = p.name;
        this.price = p.price;
    }

    void display() {
        System.out.println("Product Name : " + name);
        System.out.println("Price : ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        solutation1 p1 = new solutation1();

        solutation1 p2 = new solutation1("Laptop", 65000);

        solutation1 p3 = new solutation1(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}