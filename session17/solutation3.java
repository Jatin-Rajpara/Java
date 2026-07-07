package session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class solutation3 {

    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<String, Integer>();

        products.put("Mouse", 800);
        products.put("Keyboard", 1500);
        products.put("Headphones", 2500);
        products.put("USB Cable", 300);
        products.put("Smart Watch", 5000);

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