/*
 * (Enable the Course class cloneable) Write the Course class
 * to add a clone method to perform a deep copy on the students field.
 */
package zadaci_19_02_2016;

public class Zad5_Course {

	public static void main(String[] args) {
		// Kreiramo objekat.
		Course c = new Course("Math");
		// Dodajemo studente.
		c.addStudent("Nikola");
		c.addStudent("Ensar");
		c.addStudent("Amel");
		// Kloniramo niz.
		String[] s = c.clone();
		// Prikazujemo niz.
		System.out.println(c.getStudents());
		System.out.println(s);
	}
}

class Course implements Cloneable {
	// Ime kursa.
	protected String courseName;
	// Studenti koji pohadjaju kurs.
	protected String[] students = new String[100];
	// Broj studentata koji pohadjaju kurs.
	protected int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Metod za dodavanje studenta.
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// Metod vraca listu studenata.
	public String[] getStudents() {
		return students;
	}

	// Metod vraca broj studenata.
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// Ime kursa.
	public String getCourseName() {
		return courseName;
	}

	// Implementirani metod za kloniranje liste studentata.
	@Override
	public String[] clone() {
		// Kreiramo novi niz.
		String[] copyStudents = new String[students.length];
		for (int i = 0; i < copyStudents.length; i++) {
			// Ako nije null vrijednost,
			if (students[i] != null)
				// dodaj novi objekat u niz.
				copyStudents[i] = new String(students[i]);
		}
		// Vraca kopirani niz.
		return copyStudents;
	}
}
