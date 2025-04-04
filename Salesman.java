package electronicstore;

interface StoreOperations {
    void sellProduct(Product p, int quantity) throws OutOfStockException;
}

interface HRInterface {
    void attendTraining(String... topics);
}

// Multiple Inheritance using interfaces
public class Salesman extends Employee implements StoreOperations, HRInterface {
    private int totalSales;

    public Salesman(int empID, String name, double salary) {
        super(empID, name, salary);
        this.totalSales = 0;
    }

    @Override
    public void calculateIncentive() {
        double incentive = totalSales * 10;
        System.out.println("Incentive for " + name + ": ₹" + incentive);
    }

    @Override
    public void sellProduct(Product p, int quantity) throws OutOfStockException {
        if (p.quantity < quantity)
            throw new OutOfStockException("Insufficient stock for product: " + p.name);
        p.quantity -= quantity;
        totalSales += quantity;
        System.out.println(name + " sold " + quantity + " units of " + p.name);
    }

    @Override
    public void attendTraining(String... topics) {
        System.out.println(name + " attended training on:");
        for (String topic : topics)
            System.out.println("- " + topic);
    }
}