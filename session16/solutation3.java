package session16;

import java.util.ArrayList;

class Product {

    String name;
    double price;

    Product(String name, double price) {

        this.name = name;
        this.price = price;

    }
}

public class solutation3 {

    static double total = 0;

    static void calculateTotal(ArrayList<Product> cart) {

        for (Product p : cart) {

            total += p.price;

        }

        System.out.println("Total Cart Value : " + total);

    }

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<Product>();

        cart.add(new Product("Laptop", 55000));
        cart.add(new Product("Mouse", 800));
        cart.add(new Product("Keyboard", 1500));
        cart.add(new Product("Headphones", 2500));

        calculateTotal(cart);

    }
}