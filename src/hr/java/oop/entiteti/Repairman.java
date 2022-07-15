package hr.java.oop.entiteti;

public class Repairman {
	private String name;
	private String prezime;
	private String service;
	public Repairman(String name, String prezime, String service) {
		super();
		this.name = name;
		this.prezime = prezime;
		this.service = service;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	
	
	
}
