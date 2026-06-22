public class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor to initialize attributes
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000.0);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 80000.0);

        // Display details
        phone1.displayDetails();
        System.out.println("-------------------");
        phone2.displayDetails();
    }
}
