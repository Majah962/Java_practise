package hr.java.oop.entiteti;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		//lista auta, radimo ju ovako za sva tri, MORAMO UBACITI tostring da povuèe gettere
		Car c1 = new Car();
		c1.setChassis(12345);
		c1.setBoja(Color.WHITE);
		c1.setBrand("Audi");
		c1.setNumber(NumberDoor.THREE);
		c1.setEngineType("gas");
		c1.setWheels(4);
		
		c1.toString();
		System.out.println(c1.toString());
		
		Car c2 = new Car();
		c2.setChassis(23434);
		c2.setBoja(Color.RED);
		c2.setBrand("Passat");
		c2.setNumber(NumberDoor.SEVEN);
		c2.setEngineType("benzin");
		c2.setWheels(4);
		
		c2.toString();
		System.out.println(c2.toString());
		
		
		Car c3 = new Car();
		c3.setChassis(34235);
		c3.setBoja(Color.WHITE);
		c3.setBrand("Volvo");
		c3.setNumber(NumberDoor.FIVE);
		c3.setEngineType("diesel");
		c3.setWheels(4);
		
		c3.toString();
		System.out.println(c3.toString());
		
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		
		
		//polje vozaca, isto kao i liste, 
		
		Driver vozac1 = new Driver();
		vozac1.setBirthday(LocalDate.of(1990, 2, 2));
		vozac1.setName("Iva");
		vozac1.setSurname("Kolak");
		vozac1.setDateSince(LocalDate.of(2005, 3, 5));
		vozac1.setDateUntil(LocalDate.of(2020, 1, 1));
		
		Driver vozac2 = new Driver();
		vozac2.setBirthday(LocalDate.of(1998, 12, 2));
		vozac2.setName("Luka");
		vozac2.setSurname("Iviæ");
		vozac2.setDateSince(LocalDate.of(2005, 3, 17));
		vozac2.setDateUntil(LocalDate.of(2020, 6, 1));
		
		Driver vozac3 = new Driver();
		vozac3.setBirthday(LocalDate.of(1999, 2, 12));
		vozac3.setName("Josip");
		vozac3.setSurname("Periæ");
		vozac3.setDateSince(LocalDate.of(2005, 11, 5));
		vozac3.setDateUntil(LocalDate.of(2019, 12, 10));
		
		// ovako se rade polja, 
		Driver DriverPolje[] = new Driver[3];
		DriverPolje[0] = vozac1;
		DriverPolje[1] = vozac2;
		DriverPolje[2] = vozac3;
		int i = 0;
		do {
			System.out.println("Vozac broj " + i + ": " + DriverPolje[i].getName());
			i++;
		}
		while(i < 3);
		
		//while( i < 3) {
			//System.out.println("Vozac broj "  + i + ": " + DriverPolje[i].getName());
			//i++;
		//}
		
		//for(int i= 0; i < 3; i++) {
			 //System.out.println( "Vozac broj " + i + ": " + DriverPolje[i].getName());
		// }
		
		
//		for( Driver d: DriverPolje) {
//			System.out.println("Vozac " +  ": " + d.getName());
			
//		}
		
		LocalDate date1 = LocalDate.of(2004, 1, 1);
		if(date1.equals(vozac1)) {
			System.out.println("Vozac ima vozacku");
		} else {
			System.out.println("vozac nema vozacku: " + vozac1.getName() );
		}
		LocalDate date2 = LocalDate.of(2004, 1, 1);
		if(date2.equals(vozac2)) {
			System.out.println("Vozac ima vozacku");
		} else {
			System.out.println("vozac nema vozacku: " + vozac2.getName() );
		}
		
		LocalDate date3 = LocalDate.of(2004, 1, 1);
		if(date3.equals(vozac3)) {
			System.out.println("Vozac ima vozacku");
		} else {
			System.out.println("vozac nema vozacku: " + vozac3.getName() );
		}
		
		
		
		Bike b = new Bike();
		b.setBrzine(2);
		b.setChassis(12653);
		b.setBoja(Color.BLUE);
		b.setWheels(2);
		b.toString();
		 System.out.println(b.toString());
		
		

	}

}
