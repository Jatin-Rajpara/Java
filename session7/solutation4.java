package session7;

public class solutation4 {

    String username;
    int followers;

    void increaseF(int count) {
        followers += count;
        System.out.println("Updated Followers: " + followers);
    }

    public static void main(String[] args) {

        solutation4 profile = new solutation4();

        profile.username = "man_popaliya";
        profile.followers = 1000;

        System.out.println("Username: " + profile.username);
        System.out.println("Current Followers: " + profile.followers);

        profile.increaseF(250);
    }
}
