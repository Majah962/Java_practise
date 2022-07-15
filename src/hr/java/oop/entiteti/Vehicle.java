package hr.java.oop.entiteti;

public class Vehicle {
	// kao apstrakna klasa koja sadrži varijable, konstruktore i gettere/settere od svih ostalih
//stavimo varijable one koje imaju sve klase
	private int chassis;
	private Color boja;
	private String EngineType;
	private int wheels;
	private String brand;
	public Vehicle(int chassis, Color boja, String engineType, int wheels, String brand) {
		super();
		this.chassis = chassis;
		this.boja = boja;
		EngineType = engineType;
		this.wheels = wheels;
		this.brand = brand;
	}
	public Vehicle() {
		
	}
	public int getChassis() {
		return chassis;
	}
	public void setChassis(int chassis) {
		this.chassis = chassis;
	}
	public Color getBoja() {
		return boja;
	}
	public void setBoja(Color boja) {
		this.boja = boja;
	}
	public String getEngineType() {
		return EngineType;
	}
	public void setEngineType(String engineType) {
		EngineType = engineType;
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
	
	
	
}
