package session11;

public class solutation1 {

    private String name;
    private String owner;
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void main(String[] args) {

        solutation1 p = new solutation1();

        p.setName("My Favorites");
        p.setOwner("Roman");
        p.setTotalSongs(25);

        System.out.println("Playlist Name : " + p.getName());
        System.out.println("Owner : " + p.getOwner());
        System.out.println("Total Songs : " + p.getTotal());
    }
}
