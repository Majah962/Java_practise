package hr.java.oop.entiteti;

public class Motorbike {

	private Color bojaM;
	private int chassis;
	private String engineType;
	private String wheels;
	private String brand;
	
	public Motorbike(Color bojaM, int chassis, String engineType, String wheels, String brand) {
		super();
		this.bojaM = bojaM;
		this.chassis = chassis;
		this.engineType = engineType;
		this.wheels = wheels;
		this.brand = brand;
	}

	public Color getBojaM() {
		return bojaM;
	}

	public void setBojaM(Color bojaM) {
		this.bojaM = bojaM;
	}

	public int getChassis() {
		return chassis;
	}

	public void setChassis(int chassis) {
		this.chassis = chassis;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void Start(Driver xDriver) {
		System.out.println("Vozac pokrece motor: " + xDriver.getName());
}
	public void Stop(Driver xDriver) {
		System.out.println("Vozac zaustavlja motor : " + xDriver.getName());
}
	public void Service(Repairman xRepairman) {
		System.out.println("motor mora na servid: " + xRepairman.getName());
}
	
}
