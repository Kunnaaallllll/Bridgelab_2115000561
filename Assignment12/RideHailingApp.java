public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle ride1 = new Car("C123", "Raj", 15);
        Vehicle ride2 = new Bike("B456", "Aman", 8);
        Vehicle ride3 = new Auto("A789", "Vikram", 10);
        
        System.out.println("Fare for Car: " + ride1.calculateFare(10));
        System.out.println("Fare for Bike: " + ride2.calculateFare(10));
        System.out.println("Fare for Auto: " + ride3.calculateFare(10));
        
        ride1.getVehicleDetails();
        ride2.getVehicleDetails();
        ride3.getVehicleDetails();
    }

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    
    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    abstract double calculateFare(double distance);
    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: " + ratePerKm);
    }
    
    public double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle implements GPS {
    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    
    @Override
    public String getCurrentLocation() {
        return "Fetching Car's location...";
    }
    
    @Override
    public void updateLocation() {
        System.out.println("Car location updated.");
    }
}

class Bike extends Vehicle implements GPS {
    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    
    @Override
    public String getCurrentLocation() {
        return "Fetching Bike's location...";
    }
    
    @Override
    public void updateLocation() {
        System.out.println("Bike location updated.");
    }
}

class Auto extends Vehicle implements GPS {
    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    
    @Override
    public String getCurrentLocation() {
        return "Fetching Auto's location...";
    }
    
    @Override
    public void updateLocation() {
        System.out.println("Auto location updated.");
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation();
}
