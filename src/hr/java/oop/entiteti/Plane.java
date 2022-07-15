package hr.java.oop.entiteti;

public class Plane {
	private NumberDoor number2;
	private int chassis;
	private Color bojaP;
	private String engineType;
	private int wheels;
	private String brand;
	public Plane(NumberDoor number2, int chassis, Color bojaP, String engineType, int wheels, String brand) {
		super();
		this.number2 = number2;
		this.chassis = chassis;
		this.bojaP = bojaP;
		this.engineType = engineType;
		this.wheels = wheels;
		this.brand = brand;
	}
	public NumberDoor getNumber2() {
		return number2;
	}
	public void setNumber2(NumberDoor number2) {
		this.number2 = number2;
	}
	public int getChassis() {
		return chassis;
	}
	public void setChassis(int chassis) {
		this.chassis = chassis;
	}
	public Color getBojaP() {
		return bojaP;
	}
	public void setBojaP(Color bojaP) {
		this.bojaP = bojaP;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void Start(Driver xDriver) {
		System.out.println("Vozac pokrece avion: " + xDriver.getName());
}
	public void Stop(Driver xDriver) {
		System.out.println("Vozac zaustavlja avion: " + xDriver.getName());
}
	
	
	
	
}
