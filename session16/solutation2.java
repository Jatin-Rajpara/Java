package session16;

import java.util.HashSet;
import java.util.Iterator; // Yeh naya import add kiya hai

public class solutation2 {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<String>();

        emails.add("amit@gmail.com");
        emails.add("pooja@gmail.com");
        emails.add("rohit@yahoo.com");
        emails.add("amit@gmail.com"); 
        emails.add("sneha@gmail.com");
        emails.add("rohit@yahoo.com"); 

        System.out.println("Unique Email List:");
        Iterator<String> it = emails.iterator();
        
        while (it.hasNext()) {
            String email = it.next();
            System.out.println(email);
        }
    }
}
