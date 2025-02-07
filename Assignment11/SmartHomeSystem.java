class SmartHomeSystem{
	public static void main(String[]args){
		Thermostat thermostat = new Thermostat(2056,"Working..","At 20 deg");
		thermostat.displayStatus();
	}
}
class Device{
	private int deviceId;
	private String status;
	Device(int deviceId, String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	public void displayStatus(){
		System.out.println("Status of Device "+deviceId+" is "+status);
	}
}
class Thermostat extends Device{
	private String temperatureSetting;
	Thermostat(int deviceId, String status, String temperatureSetting){
		super(deviceId,status);
		this.temperatureSetting = temperatureSetting;
	}
	public void displayStatus(){
		super.displayStatus();
		System.out.println("and its Temperature is: "+temperatureSetting);
	}
}