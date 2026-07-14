package session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class solutation3 {

    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<String, Integer>();

        products.put("Apple", 120);
        products.put("Mango", 1500); 
        products.put("Banana", 60);
        products.put("Cherry", 2500);
        products.put("Dragon Fruit", 300);

        Iterator<Map.Entry<String, Integer>> it =
                products.entrySet().iterator();

        System.out.println("Products Above 1000:");

        while (it.hasNext()) {

            Map.Entry<String, Integer> entry = it.next();

            if (entry.getValue() > 1000) {

                System.out.println(entry.getKey()
                        + " : " + entry.getValue());

            }
        }
    }
}
