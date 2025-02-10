import java.util.*;

class VehicleRentalSystem{
	public static void main(String[]args){
		List<Vehicle> vehicles = new ArrayList<>();
		Car car = new Car(9211, 100);
		Bike bike = new Bike(1243, 50);
		Truck truck = new Truck(7584, 200);
		
		
		vehicles.add(car);
		vehicles.add(bike);
		vehicles.add(truck);

		for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
			double rentalCost = vehicle.calculateRentalCost(10);
			double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;
			System.out.println("Rental Cost for " + 10 + " days:" + rentalCost);
			System.out.println("Insurance Cost: " + insuranceCost+" Rs.");
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }
	}
}
abstract class Vehicle{
	private int vehicleNumber, rentalRate;
	private String type;
	Vehicle(int vehicleNumber, String type, int rentalRate){
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}
	abstract double calculateRentalCost(int days);
	public void displayDetails(){
		System.out.println("Vehicle Number: "+ vehicleNumber);
		System.out.println("Vehicle Type: "+ type);
		System.out.println("Vehicle Rental Type: "+ rentalRate);
	}
	public int getRentalRate(){
		return rentalRate;
	}
}
class Car extends Vehicle implements Insurable{
	Car(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Car", rentalRate);		
	}
	@Override
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 5% of rental rate";
    }
}
class Bike extends Vehicle implements Insurable{
	Bike(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Bike", rentalRate);		
	}
	@Override
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 10% of rental rate";
    }
}
class Truck extends Vehicle implements Insurable{
	Truck(int vehicleNumber, int rentalRate){
		super(vehicleNumber, "Truck", rentalRate);		
	}
	@Override
	double calculateRentalCost(int days){
		return getRentalRate() * days;
	}
	public double calculateInsurance() {
        return getRentalRate() * 0.02;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 2% of rental rate";
    }
}

interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}