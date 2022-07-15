package hr.java.oop.entiteti;

public class Truck {
	private NumberDoor number1;
	private int chassis;
	private Color bojaT;
	private String engineType;
	private int wheels;
	private String brand;

	public Truck(NumberDoor number1, int chassis, Color bojaT, String engineType, int wheels, String brand) {
		super();
		this.number1 = number1;
		this.chassis = chassis;
		this.bojaT = bojaT;
		this.engineType = engineType;
		this.wheels = wheels;
		this.brand = brand;
	}

	public NumberDoor getNumber1() {
		return number1;
	}

	public void setNumber1(NumberDoor number1) {
		this.number1 = number1;
	}

	public int getChassis() {
		return chassis;
	}

	public void setChassis(int chassis) {
		this.chassis = chassis;
	}

	public Color getBojaT() {
		return bojaT;
	}

	public void setBojaT(Color bojaT) {
		this.bojaT = bojaT;
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
			System.out.println("Vozac pokrece kamion: " + xDriver.getName());
	}
	public void Stop(Driver xDriver) {
		System.out.println("Vozac zaustavlja kamion: " + xDriver.getName());

	}
	public void Serviser(Repairman xRepairman) {
		System.out.println("Kamion mora na servis: " + xRepairman.getName());
}
}
