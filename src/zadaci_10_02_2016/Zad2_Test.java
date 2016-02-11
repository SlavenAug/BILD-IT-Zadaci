/*
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has
 * an office, salary, and date hired. A faculty member has office
 * hours and a rank. A staff member has a title. Override the toString method in
 * each class to display the class name and the person’s name.
 */
package zadaci_10_02_2016;

import java.util.Date;

public class Zad2_Test {

	public static void main(String[] args) {
		Zad2_Student student = new Zad2_Student("Nikola", "Njegos", 387656455,
				"nikola2@hotmail.com", 1);
		System.out.println(student);

		
		Zad2_Employee employee = new Zad2_Employee("Slaven", "Barici", 387666666,
				"slaven@stf.org", "phiz", 5000, new Date());
		System.out.println(employee);

		Zad2_Faculty fax = new Zad2_Faculty("IT", "math", 3, 4.5);
		System.out.println(fax);

		Zad2_Staff staff = new Zad2_Staff("Mladen", "Dobojska", 065666665,
				"mladen00@gmail.com", "Elektrotehnicki", 18000, new Date(),
				"doc");
		System.out.println(staff);
	}
	
}
