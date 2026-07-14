package session16;

import java.util.HashMap;
import java.util.ArrayList;

public class solutation4 {

    public static void main(String[] args) {

        HashMap<String, Integer> followers = new HashMap<String, Integer>();
      
        followers.put("virat", 270000000);
        followers.put("cristiano", 650000000);
        followers.put("selenagomez", 420000000);
        followers.put("therock", 395000000);
        followers.put("leomessi", 510000000);

        int maxFollowers = 0;
        ArrayList<String> usernames = new ArrayList<String>(followers.keySet());

        for (int i = 0; i < usernames.size(); i++) {
            String user = usernames.get(i);
            int count = followers.get(user); 
            
            if (count > maxFollowers) {
                maxFollowers = count;
            }
        }

        System.out.println("User(s) with Highest Followers:");

        for (int i = 0; i < usernames.size(); i++) {
            String user = usernames.get(i);
            int count = followers.get(user);

            if (count == maxFollowers) {
                System.out.println(user + " : " + count);
            }
        }
    }
}
