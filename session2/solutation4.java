package session2;

import java.util.Scanner;

public class solutation4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter unread messages: ");
    int messages = sc.nextInt();
    String result = (messages == 0)
    ? "No new messages"
    : (messages <= 10)
    ? "Few messages"
    : "Too many messages";
    System.out.println(result);
}
}

