package session9;

public class solutation5 {

    String name;

    solutation5(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Product Name : " + name);
    }

    public static void main(String[] args) {

        solutation5 p = new solutation5("Laptop");

        p.display();
    }
}