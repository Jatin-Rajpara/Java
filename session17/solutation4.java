package session17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class solutation4 {

    public static void printTopUsers(HashMap<String, Integer> followers) {

        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<Map.Entry<String, Integer>>(followers.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> a,
                               Map.Entry<String, Integer> b) {

                return b.getValue().compareTo(a.getValue());

            }
        });

        System.out.println("Top 3 Users:");

        for (int i = 0; i < 3 && i < list.size(); i++) {

            System.out.println(list.get(i).getKey()
                    + " : " + list.get(i).getValue());

        }
    }

    public static void main(String[] args) {

        HashMap<String, Integer> followers = new HashMap<String, Integer>();

        followers.put("virat", 270000000);
        followers.put("cristiano", 650000000);
        followers.put("leomessi", 510000000);
        followers.put("selenagomez", 420000000);
        followers.put("therock", 395000000);

        printTopUsers(followers);

    }
}