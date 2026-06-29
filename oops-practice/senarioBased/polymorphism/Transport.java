abstract class Vehicle {
    String vehicleNumber;
    abstract double fuelCost(int km);
}

class Car extends Vehicle {
    double fuelCost(int km) { return km * 5; }
}
class Bus extends Vehicle {
    double fuelCost(int km) { return km * 10; }
}
class Bike extends Vehicle {
    double fuelCost(int km) { return km * 2; }
}

// New class added without touching old code
class ElectricCar extends Vehicle {
    double fuelCost(int km) { return km * 1; }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle[] fleet = { new Car(), new Bus(), new Bike(), new ElectricCar() };
        for (Vehicle v : fleet) {
            System.out.println(v.getClass().getSimpleName() + " cost: " + v.fuelCost(100));
        }
    }
}
