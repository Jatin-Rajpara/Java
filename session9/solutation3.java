package session9;

class UserProfile {

    String name;

    UserProfile(String name) {
        this.name = name;
    }

    void displayProfile() {
        System.out.println("User Name : " + name);
    }
}

class IProfile extends UserProfile {

    int followers;

    IProfile(String name, int followers) {
        super(name);
        this.followers = followers;
    }

    void display() {
        System.out.println("Followers : " + followers);
    }
}

public class solutation3 extends UserProfile {

    String brandName;

    solutation3(String name, String brandName) {
        super(name);
        this.brandName = brandName;
    }

    void displayBrand() {
        System.out.println("Brand Name : " + brandName);
    }

    public static void main(String[] args) {

        IProfile i = new IProfile("Jatin", 15000);
        solutation3 b = new solutation3("Admin", "Nike");

        i.displayProfile();
        i.display();

        System.out.println();

        b.displayProfile();
        b.displayBrand();
    }
}
