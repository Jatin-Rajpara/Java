package session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class solutation1 {

    public static void main(String[] args) {

        HashMap<String, Double> orders = new HashMap<String, Double>();

        orders.put("ORD101", 350.50);
        orders.put("ORD102", 499.00);
        orders.put("ORD103", 220.75);
        orders.put("ORD104", 680.00);
        orders.put("ORD105", 150.25);

        Iterator<Map.Entry<String, Double>> it = orders.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Double> entry = it.next();

            System.out.println("Order ID: " + entry.getKey()
                    + "  Amount: " + entry.getValue());

        }
    }
}