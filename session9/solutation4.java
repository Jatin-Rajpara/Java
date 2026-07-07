package session9;

class AppUser {

    String name;

    AppUser(String name) {
        this.name = name;
        System.out.println("App User : " + name);
    }
}

class VerifiedUser extends AppUser {

    VerifiedUser(String name) {
        super(name);
        System.out.println("Verified User");
    }
}

public class solutation4 extends VerifiedUser {

    solutation4(String name) {
        super(name);
        System.out.println("Welcome Celebrity " + name);
    }

    public static void main(String[] args) {

        solutation4 user = new solutation4("Virat Kohli");
        System.out.println("Created user object: " + user.name);
    }
}