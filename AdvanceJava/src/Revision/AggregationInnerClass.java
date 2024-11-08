package Revision;

class Taxi {
    private Driver driver; // aggregation

    public Taxi(Driver driver) {
        this.driver = driver;
    }

    public class Driver {
        private String driverName;

        public Driver (String driverName) {
            this.driverName = driverName;
        }

        public String getDriver() {
            return this.driverName;
        }
    }

    public void displayDriver() {
        System.out.println("The driver is " + this.driver.getDriver());
    }
}

public class AggregationInnerClass {
    public static void main(String[] args) {
        Taxi.Driver driver = new Taxi(null).new Driver("Jack");
        Taxi taxi = new Taxi(driver);
        taxi.displayDriver();
    }
}
