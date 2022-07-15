package hr.java.oop.entiteti;

public class Bike  extends Vehicle implements Vozila{

	private int brzine;

	public int getBrzine() {
		return brzine;
	}

	public void setBrzine(int brzine) {
		this.brzine = brzine;
	}

	public Bike(int brzine) {
		super();
		this.brzine = brzine;
	}
	
	
	

	@Override
	public String toString() {
		return "Bike [brzine=" + brzine + ", getChassis()=" + getChassis() + ", getBoja()=" + getBoja()
				+ ", getEngineType()=" + getEngineType() + ", getWheels()=" + getWheels() + ", getBrand()=" + getBrand()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Bike(int chassis, Color boja, String engineType, int wheels, String brand, int brzine) {
		super(chassis, boja, engineType, wheels, brand);
		this.brzine = brzine;
	}

	

	public Bike(int chassis, Color boja, String engineType, int wheels, String brand) {
		super(chassis, boja, engineType, wheels, brand);
		// TODO Auto-generated constructor stub
	}

	public Bike() {
		super();
	}

	@Override
	public void startT(Driver xDriver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopT(Driver xDriver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceT(Repairman xRepairman) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

	
	
	
//	private int chassis;
//	private Color boja;
//	private String engineType;
//	private int wheels;
//	private String brand;
//	public Bike(int chassis, Color boja, String engineType, int wheels, String brand) {
//		super();
//		this.chassis = chassis;
//		this.boja = boja;
//		this.engineType = engineType;
//		this.wheels = wheels;
//		this.brand = brand;
//	}
//	public int getChassis() {
//		return chassis;
//	}
//	public void setChassis(int chassis) {
//		this.chassis = chassis;
//	}
//	public Color getBoja() {
//		return boja;
//	}
//	public void setBoja(Color boja) {
//		this.boja = boja;
//	}
//	public String getEngineType() {
//		return engineType;
//	}
//	public void setEngineType(String engineType) {
//		this.engineType = engineType;
//	}
//	public int getWheels() {
//		return wheels;
//	}
//	public void setWheels(int wheels) {
//		this.wheels = wheels;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	
//	public void Start(Driver xDriver) {
//		System.out.println("Vozac pokrece bicikl: " + xDriver.getName());// pdriver.getname- to nam ttreba da povuèemo ime, mogli smo i tostring onda bi sve povukli,ali nam treba tostring gore 
//}
//	public void Stop(Driver xDriver) {
//		System.out.println("Vozac zaustavlja bicikl: " + xDriver.getName());
//}
//	public void Service(Repairman xRepairman) {
//		System.out.println("Bicikl mora na servis: " + xRepairman.getName());
//}
//	
//	
}
