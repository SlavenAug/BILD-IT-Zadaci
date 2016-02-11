package zadaci_10_02_2016;

public class Zad2_Faculty extends Zad2_Employee {

	protected int hours;
	protected double rank;

	// No-arg konstruktor.
	public Zad2_Faculty() {

	}

	// Konostruktor kreira objekat Faculty sa odredjenim parametrima.
	public Zad2_Faculty(String name, String office, int hours, double rank) {
		this.name = name;
		this.office = office;
		this.hours = hours;
		this.rank = rank;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public String toString() {
		return "Class Faculty\nname: " + name;
	}
}
