package electronicstore;

// Abstract class for Products
public abstract class Product {
    protected int productID;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(int productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Overloaded constructor
    public Product(int productID, String name) {
        this(productID, name, 0.0, 0);
    }

    // Overloaded method
    public void updateProduct(int quantity) {
        this.quantity += quantity;
    }

    public void updateProduct(int quantity, double price) {
        this.quantity += quantity;
        this.price = price;
    }

    public abstract void display();
}