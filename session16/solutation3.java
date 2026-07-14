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

    static void tot(ArrayList<Product> cart) {

      
        for (int i = 0; i < cart.size(); i++) {
            Product p = cart.get(i); 
            total += p.price;
        }

        System.out.println("Total Cart Value : " + total);
    }

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<Product>();

        cart.add(new Product("Notebook", 120));
        cart.add(new Product("Pen Drive", 450));
        cart.add(new Product("School Bag", 850));
        cart.add(new Product("Geometry Box", 150));

        tot(cart); 
    }
}
