package hr.java.oop.entiteti;

import java.time.LocalDate;

public class Driver {
	private String name;
	private String surname;
	private LocalDate birthday;
	private LocalDate dateSince;
	private LocalDate dateUntil;
	
	public Driver(String name, String surname, LocalDate birthday, LocalDate dateSince, LocalDate dateUntil) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.dateSince = dateSince;
		this.dateUntil = dateUntil;
		
		
	}
	public Driver() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public LocalDate getDateSince() {
		return dateSince;
	}
	public void setDateSince(LocalDate dateSince) {
		this.dateSince = dateSince;
	}
	public LocalDate getDateUntil() {
		return dateUntil;
	}
	public void setDateUntil(LocalDate dateUntil) {
		this.dateUntil = dateUntil;
	}
	// to string na treba da bi kad dodamo settere ne pišemo getter nego sa tostring to sve povuèemo
	public String toString() {
		return "Driver [name=" + name + ", surname=" + surname + ", birthday=" + birthday + ", dateSince=" + dateSince
				+ ", dateUntil=" + dateUntil + "]";
	}
	
	
	
	
	
}
