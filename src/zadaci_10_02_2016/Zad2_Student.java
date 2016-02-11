package zadaci_10_02_2016;

public class Zad2_Student extends Zad2_Person {

	// Finalne vrijednosti statusa studenta.
	private final String FRESHMAN = "freshman";
	private final String SPOPHOMORE = "sophomore";
	private final String JUNIOR = "junior";
	private final String SENIOR = "senior";
	private String status;

	// No-arg konstruktor.
	public Zad2_Student() {

	}

	public Zad2_Student(String name, String address, int phoneNumber, String email, int status) {
		super(name, address, phoneNumber, email);
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		this.status = setStatus(status);
	}

	// Metod za izbor statusa studneta. Ocekuje se unos od 1 - 4.
	public String setStatus(int i) {
		switch (i) {
		case 1:
			return FRESHMAN;
		case 2:
			return SPOPHOMORE;
		case 3:
			return JUNIOR;
		case 4:
			return SENIOR;
		default:
			return "student";
		}
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Class name: Student\nname: " + getName();
	}

}
