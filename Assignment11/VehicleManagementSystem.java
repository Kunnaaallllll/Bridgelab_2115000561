class Vehicle{
    String model;
    int maxSpeed;
    public Vehicle(String model,int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void displayInfo() {
        System.out.println("Model: "+model);
        System.out.println("Max Speed: "+maxSpeed+" km/h");
    }
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle{
    int batteryCapacity;
    public ElectricVehicle(String model,int maxSpeed,int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    public void charge(){
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity: "+batteryCapacity+" kWh");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    double fuelCapacity;
    public PetrolVehicle(String model,int maxSpeed,double fuelCapacity){
        super(model, maxSpeed);
        this.fuelCapacity=fuelCapacity;
    }
    @Override
    public void refuel(){
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Capacity: "+fuelCapacity+" liters");
    }
}
public class VehicleManagementSystem{
    public static void main(String[] args){
        ElectricVehicle ev = new ElectricVehicle("BMW",250,100);
        PetrolVehicle pv = new PetrolVehicle("Audi",180,50);
        System.out.println("electric vehicle details");
        ev.displayInfo();
        ev.charge();
        System.out.println("petrol vehicle Details");
        pv.displayInfo();
        pv.refuel();
    }
}
