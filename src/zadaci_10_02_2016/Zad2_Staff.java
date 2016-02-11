package zadaci_10_02_2016;

import java.util.Date;

public class Zad2_Staff extends Zad2_Employee {

	private String title;

	// No-arg konstruktor.
	public Zad2_Staff() {

	}

	// Kreiranje objekta sa odrednenim vrijednostima.
	public Zad2_Staff(String name, String address, int phoneNumber, String email, String office, double salary,
			Date dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Class Staff\nname: " + name;
	}

}
