package session2;

import java.util.*;

public class solutation4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unread messages: ");
        int msg = sc.nextInt();
        
        String result = "";

       
        if (msg == 0) {
            result = "No new messages";
        } else if (msg <= 10) {
            result = "Few messages";
        } else {
            result = "Too many messages";
        }

        System.out.println(result);
    }
}
