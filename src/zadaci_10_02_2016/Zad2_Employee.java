package zadaci_10_02_2016;

import java.util.Date;

public class Zad2_Employee extends Zad2_Person {

	private double salary;
	protected String office;
	protected Date dateHired;

	// No-arg konstruktor.
	public Zad2_Employee() {

	}

	// Konstruktor kreira objekat sa odredjenim vrijednositima.
	public Zad2_Employee(String name, String address, int phoneNumber, String email, String office, double salary,
			Date dateHired) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Class name: Employee\nname: " + getName();
	}

}
