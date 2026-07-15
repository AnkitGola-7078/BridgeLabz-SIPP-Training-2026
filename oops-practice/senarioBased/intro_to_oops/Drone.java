public class Drone {
    int droneId;                 // instance variable
    int batteryPercentage;        // instance variable
    static String companyName;    // static variable (shared by all drones)

   
    Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    void startDelivery() {
        if (batteryPercentage > 20) {
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId + " has low battery. Cannot start delivery.");
        }
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        // Set static company name (shared by all drones)
        Drone.companyName = "SkyLogistics";

        // Create multiple drones
        Drone d1 = new Drone(101, 80);
        Drone d2 = new Drone(102, 15);

        // Start deliveries
        d1.startDelivery();
        d2.startDelivery();

        System.out.println("-------------------");

        // Display status of both drones
        d1.displayStatus();
        System.out.println("-------------------");
        d2.displayStatus();
    }
}
