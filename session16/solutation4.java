package session16;

import java.util.HashMap;
import java.util.Map;

public class solutation4 {

    public static void main(String[] args) {

        HashMap<String, Integer> followers = new HashMap<String, Integer>();

        followers.put("virat", 270000000);
        followers.put("cristiano", 650000000);
        followers.put("selenagomez", 420000000);
        followers.put("therock", 395000000);
        followers.put("leomessi", 510000000);

        int maxFollowers = 0;

        for (int count : followers.values()) {

            if (count > maxFollowers) {
                maxFollowers = count;
            }

        }

        System.out.println("User(s) with Highest Followers:");

        for (Map.Entry<String, Integer> entry : followers.entrySet()) {

            if (entry.getValue() == maxFollowers) {

                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }
    }
}