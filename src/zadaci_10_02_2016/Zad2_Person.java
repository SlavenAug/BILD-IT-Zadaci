package zadaci_10_02_2016;

public class Zad2_Person {

	protected String name;
	protected String address;
	protected int phoneNumber;
	protected String email;

	// No-arg konstruktor.
	public Zad2_Person() {

	}

	// Konstruktor kreira objekat sa odredjenim vrijednostima.
	public Zad2_Person(String name, String address, int phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Class name: Person\nName: " + name;
	}

}
