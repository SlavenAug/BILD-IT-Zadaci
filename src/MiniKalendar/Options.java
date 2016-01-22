package MiniKalendar;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Options {

	Options() {

	}

	// Metoda koja upisuje korisnikov unos u file.
	public void writeData(String fileName) throws Exception {

		java.io.File file = new java.io.File(fileName);

		// Kreiramo string za cuvanje podsjetnika.
		String s = "";

		try {
			// Objekat za citanje iz fajla.
			Scanner read = new Scanner(file);
			if (read.hasNextLine()) {
				System.out.println("Na uneseni dan vec imate podsjetnik: ");
				readData(fileName);

				System.out.println("Za dodavanje novog, ");
				while (read.hasNextLine()) {
					s = read.nextLine();
				}
				read.close();
			}
		} catch (Exception x) {
			System.out.println("Na uneseni dan nemate podsjetnik:");
		}

		try {
			java.util.Scanner unos1 = new java.util.Scanner(System.in);
			System.out.println("Unesite vas podsjetnik: ");
			String podsjetnik = unos1.nextLine();

			// Objekat za upisivanje podsjetnika u file.
			java.io.PrintWriter unos = new java.io.PrintWriter(file);
			unos.println(s + podsjetnik + "; ");// Writing to the file
			System.out.println("Uspjesno ste dodali podsjetnik.");
			System.out.println();

			unos.close();

		} catch (Exception e) {
			System.out.println("Greska!!!");
		}

	}

	// Metoda za citanje podsjetnika iz fajla.
	public void readData(String fileName) throws IOException {

		java.io.File file = new java.io.File(fileName);

		try {
			// Skener objekat za citanje iz fajla.
			Scanner input = new Scanner(file);
			// Petlja za citanje fajla.
			while (input.hasNextLine()) {
				String podsjetnik = input.nextLine();
				// Printa rezultat.
				System.out.println(podsjetnik + "\n");
			}

			input.close();
		} catch (Exception e) {
			System.out.println("Za trazeni datum nemate podsjetnik!");
			System.out.println();
		}

	}

	public void printCalendar(int year, int month) {

		// Kreiramo varijable
		int dayOfWeek = 1;
		String space = "     ";

		// Kreiramo listu mjeseca.
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		// Kreiramo listu broj dana za odredjeni mjesec.
		int[] brDanaMjeseca = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Calendar calendar = new GregorianCalendar(year, month, 1);

		// Ako nije prijestupna dodjeljujemo joj 29. dan.
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				brDanaMjeseca[1] = 29;
			}
		} else if (year % 4 == 0) {
			brDanaMjeseca[1] = 29;
		}

		System.out.println("\t" + monthName[month] + " " + year);
		System.out.println("----------------------------------------");
		System.out.println("Son   Mon   Tos   Wen   Thu   Fri   Sat\n");
		System.out.println("----------------------------------------");

		// Petlja trazi gdje ce isprintati prvi dan mjeseca.
		for (int brojac = 1; brojac <= brDanaMjeseca[month]; brojac++) {
			if (brojac > 9) {
				space = "    ";
			}

			if (brojac == 1) {
				while (dayOfWeek != calendar.get(Calendar.DAY_OF_WEEK)) {
					System.out.print(space + " ");
					dayOfWeek++;
				}
				// Printamo prvi dan mjeseca.
				System.out.print(brojac + space);
				dayOfWeek++;
			} else {

				if (dayOfWeek == 8) {
					System.out.print("\n" + brojac + space);
					dayOfWeek = 2;
				} else {

					System.out.print(brojac + space);
					dayOfWeek++;
				}
			}
		}

	}

}
