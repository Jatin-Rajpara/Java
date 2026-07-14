package session11;

public class solutation2 {

    private String pName;
    private double price;
    private double discount;

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return price - (price * discount / 100);
    }

    public static void main(String[] args) {

        solutation2 p = new solutation2();

        p.setProductName("PC");
        p.setPrice(70000);
        p.setDiscount(9);

        System.out.println("Product Name : " + p.getPName());
        System.out.println("Price : " + p.getPrice());
        System.out.println("Discount : " + p.getDiscount() + "%");
        System.out.println("Final Price : " + p.getFinalPrice());
    }
}
