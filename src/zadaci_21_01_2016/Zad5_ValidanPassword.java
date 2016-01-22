/*
 * Neke web  stranice forsiraju određena pravila
 * za passworde. Napisati metodu koja provjerava da li je
 * unijeti string validan password. Pravila da bi password
 * bio validan su sljedeća: 1. Password mora biti sačinjen
 * od najmanje 8 karaktera. 2. Password smije da se sastoji
 * samo od slova i brojeva. 3. Password mora sadržati najmanje
 * 2 broja. Napisati program koji pita korisnika da unese
 * password te mu ispisuje "password je validan" ukoliko su
 * sva pravila ispoštovana ili "password nije validan" ukoliko
 * pravila nisu ispoštovana.
 */
package zadaci_21_01_2016;

import java.util.Scanner;

public class Zad5_ValidanPassword {
	// Promjenjiva za poruku greske;
	static String errorMessage = "";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cond = true;
		// Unos sifre od korisnika.
		do {
			System.out.println("Unesite sifru: ");
			String password = input.nextLine();
			// provjera da li je unesena sifra validna
			if (passwordValidation(password)) {
				System.out.println("Sifra je validna :)");
				cond = true; // postavljanje uslova za izlaz iz petlje
			} else { // ako nije ocisti poruku
				System.out.println(errorMessage + "\nPokusajte ponovo!");
				errorMessage = "";
				cond = false; // postavi uslov na false
			}
		} while (!cond);
		// zatvaranje ulaza
		input.close();

	}

	public static boolean passwordValidation(String pass) {
		boolean isValid = true; // ispravnost sifre
		int numLength = 0; // korisi se za provjeru brojeva u sifri
		// Ako je sifra manja od 8 karaktera zavrsi provjeru,
		if (pass.length() < 8) {
			// upisi gresku i
			errorMessage += "Sifra mora imati najmanje 8 karaktera!\n";
			isValid = false; // postavi da je sifra neispravna.
		} else {
			pass = pass.toLowerCase(); // Kovnertovanje sifre u mala slova.
			for (int i = 0; i < pass.length(); i++) {
				char character = pass.charAt(i); // trenutni karakter koji se
													// provjerava.

				if (character >= '0' && character <= '9') { // Provjera brojeva
															// u sifri.
					numLength++; // Ako se nalazi broj u sifri povecavamo
									// brojac.
				}

				if (!((character >= '0' && character <= '9') || (character >= 'a' && character <= 'z'))) {
					// Ako poruka sadrzi nesto osim slova i brojeva onda upisi
					// gresku,
					errorMessage += "Sifra se moze sastojati samo od slova i brojeva!\n";
					// postavi da je sifra neispravna i
					isValid = false;
					break; // zavrsi provjeru.
				}
			}

			if (numLength < 2 && isValid) { // Ako je broj brojeva manji od dva,
				// upisi gresku i
				errorMessage += "Sifra mora imati najmanje 2 broja!\n";
				// postavi da je sifra neispravna.
				isValid = false;
			}
		}
		return isValid; // Vracamo ispravnost sifre.
	}

}
