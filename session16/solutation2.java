package session16;

import java.util.HashSet;

public class solutation2 {

    public static void main(String[] args) {

        HashSet<String> users = new HashSet<String>();

        users.add("man123");
        users.add("rahul99");
        users.add("priya07");
        users.add("amit21");
        users.add("neha88");
        users.add("rahul99");
        users.add("man123");

        System.out.println("Unique Usernames:");

        for (String user : users) {

            System.out.println(user);

        }
    }
}