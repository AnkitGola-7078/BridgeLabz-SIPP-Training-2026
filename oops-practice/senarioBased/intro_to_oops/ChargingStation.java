public class ChargingStation {
    // Static variables (shared by all stations)
    static int totalStations = 0;
    static double electricityRate = 10.0; // Rs per unit

    // Instance variables
    int stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++; // increment whenever new station is created
    }

    // Method to calculate bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Method to display station details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate + " Rs/unit");
        System.out.println("Bill: " + calculateBill());
    }

    public static void main(String[] args) {
        // Create 5 stations
        ChargingStation s1 = new ChargingStation(101, 120.5);
        ChargingStation s2 = new ChargingStation(102, 80.0);
        ChargingStation s3 = new ChargingStation(103, 150.0);
        ChargingStation s4 = new ChargingStation(104, 95.5);
        ChargingStation s5 = new ChargingStation(105, 60.0);

        // Display details
        s1.displayStationDetails();
        System.out.println("-------------------");
        s2.displayStationDetails();
        System.out.println("-------------------");
        s3.displayStationDetails();
        System.out.println("-------------------");
        s4.displayStationDetails();
        System.out.println("-------------------");
        s5.displayStationDetails();

        // Show total stations
        System.out.println("===================");
        System.out.println("Total Stations: " + ChargingStation.totalStations);

        // Change electricity rate (affects all stations immediately)
        ChargingStation.electricityRate = 12.0;
        System.out.println("\nUpdated Electricity Rate: " + ChargingStation.electricityRate);

        // Recalculate bills with new rate
        System.out.println("\n--- After Rate Change ---");
        s1.displayStationDetails();
        System.out.println("-------------------");
        s2.displayStationDetails();
    }
}
