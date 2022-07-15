package hr.java.oop.entiteti;

public class Car extends Vehicle implements Vozila {

	private NumberDoor number;
	
	
	
	public NumberDoor getNumber() {
		return number;
	}

	public void setNumber(NumberDoor number) {
		this.number = number;
	}

	public Car(int chassis, Color boja, String engineType, int wheels, String brand, NumberDoor number) {
		super(chassis, boja, engineType, wheels, brand);
		this.number = number;
	}

	public Car(int chassis, Color boja, String engineType, int wheels, String brand) {
		super(chassis, boja, engineType, wheels, brand);
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public String toString() {
		return "Car [number=" + number + ", getChassis()=" + getChassis() + ", getBoja()=" + getBoja()
				+ ", getEngineType()=" + getEngineType() + ", getWheels()=" + getWheels() + ", getBrand()=" + getBrand()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Car() {
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
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private NumberDoor broj;
//	private int chassis;
//	private Color boja;
//	private String engineType;
//	private int wheels;
//	private String brand;
//	
//	
//	
//	// to string na treba da bi kad dodamo settere ne pi�emo getter nego sa tostring to sve povu�emo
//	@Override
//	public String toString() {
//		return "Car [broj=" + broj + ", chassis=" + chassis + ", boja=" + boja + ", engineType=" + engineType
//				+ ", wheels=" + wheels + ", brand=" + brand + "]";
//	}
//
//
//
//
//	public Car(NumberDoor broj, int chassis, Color boja, String engineType, int wheels, String brand) {
//		super();
//		this.broj = broj;
//		this.chassis = chassis;
//		this.boja = boja;
//		this.engineType = engineType;
//		this.wheels = wheels;
//		this.brand = brand;
//	}
//	
//	
//	
//	//ovo nam treba da bi kreirali objekt,ina�e na neda 
//	public Car() {
//		
//	}
//
//
//
//
//	public NumberDoor getBroj() {
//		return broj;
//	}
//
//
//
//
//	public void setBroj(NumberDoor broj) {
//		this.broj = broj;
//	}
//
//
//
//
//	public int getChassis() {
//		return chassis;
//	}
//
//
//
//
//	public void setChassis(int chassis) {
//		this.chassis = chassis;
//	}
//
//
//
//
//	public Color getBoja() {
//		return boja;
//	}
//
//
//
//
//	public void setBoja(Color boja) {
//		this.boja = boja;
//	}
//
//
//
//
//	public String getEngineType() {
//		return engineType;
//	}
//
//
//
//
//	public void setEngineType(String engineType) {
//		this.engineType = engineType;
//	}
//
//
//
//
//	public int getWheels() {
//		return wheels;
//	}
//
//
//
//
//	public void setWheels(int wheels) {
//		this.wheels = wheels;
//	}
//
//
//
//
//	public String getBrand() {
//		return brand;
//	}
//
//
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//
//
//	//metoda, potrebno je imati u () klasu i varijablu zato �to se mora pozvati, time smo samo DRIVERU omogu�ili da vozi auto, da stvimo i ostale klase onda bi svima omogu�ili
//	
//	public void Start(Driver xDriver) {
//		System.out.println("Vozac pokrece auto: " + xDriver.getName()); //pdriver.getname- to nam ttreba da povu�emo ime, mogli smo i tostring onda bi sve povukli,ali nam treba tostring gore 
//}
//	public void Stop(Driver xDriver) {
//		System.out.println("Vozac zaustavlja auto: " + xDriver.getName());
//}
//	public void Service(Repairman xRepairman) {
//		System.out.println("Auto mora na servis: " + xRepairman.getName());
//}
//	
//	
//	
	
}
