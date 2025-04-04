package electronicstore;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        TV sony = new TV(101, "Sony Bravia", 50000, 10, 55.0);
        Salesman emp1 = new Salesman(1, "Aarush", 30000);

        sony.display();

        try {
            emp1.sellProduct(sony, 3);
            emp1.sellProduct(sony, 8); // Will throw exception
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            emp1.takeLeave(10, 15, 8); // Will throw exception
        } catch (InvalidLeaveException e) {
            System.out.println("Leave Error: " + e.getMessage());
        }

        emp1.attendTraining("Sales Pitching", "Product Knowledge");
        emp1.calculateIncentive();

        // File I/O Example
        try (FileWriter fw = new FileWriter("employee.txt")) {
            fw.write("Employee: " + emp1.name + ", Salary: ₹" + emp1.salary);
        } catch (IOException e) {
            System.out.println("File write failed: " + e.getMessage());
        }

        // Multithreading
        Thread updater = new Thread(() -> {
            sony.updateProduct(5, 52000);
            System.out.println("Inventory updated asynchronously!");
        });
        updater.start();
    }
}