package electronicstore;

public class TV extends Product {
    private double screenSize;

    public TV(int productID, String name, double price, int quantity, double screenSize) {
        super(productID, name, price, quantity);
        this.screenSize = screenSize;
    }

    @Override
    public void display() {
        System.out.println("TV: " + name + " | ID: " + productID + " | Price: " + price +
                " | Quantity: " + quantity + " | Screen Size: " + screenSize + " inches");
    }
}