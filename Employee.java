package electronicstore;

// Abstract Employee class
public abstract class Employee {
    protected int empID;
    protected String name;
    protected double salary;
    protected int leavesTaken;

    public Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.leavesTaken = 0;
    }

    // Inner Class
    class SalesData {
        int sales;

        SalesData(int sales) {
            this.sales = sales;
        }

        void displaySales() {
            System.out.println("Sales made: " + sales);
        }
    }

    public abstract void calculateIncentive();

    public void takeLeave(int... days) throws InvalidLeaveException {
        int total = 0;
        for (int day : days) {
            total += day;
        }
        if (total > 30) throw new InvalidLeaveException("Exceeded leave limit!");
        leavesTaken += total;
    }
}