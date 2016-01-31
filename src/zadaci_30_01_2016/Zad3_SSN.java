/*
 * Napisati program koji pita korisnika da unese
 * Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D
 * predstavlja broj. Program treba da provjerava da li je broj
 * unesešen u ispravnom formatu. Ukoliko nije, program pita
 * korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
 * formatu, program završava sa radom.
 */
package zadaci_30_01_2016;

import methods.Unos;

public class Zad3_SSN {

	public static void main(String[] args) {

		String s;

		do {
			// Unos SSN broja.
			System.out.println("Please enter SSN:");
			s = Unos.stringNextLine();

			// Ako je validan prikazi poruku i izadji iz petlje.
			if (isValidSSN(s)) {
				System.out.println("Entered SSN is valid!");
				break;
			} else {
				// Ako nije validan onda pitaj korisnika da ponovo unese broj.
				System.out.println("Entered SSN is not valid! Please try again!");
			}

			// Vrti petlju sve dok se ne unese validan SSN broj.
		} while (!isValidSSN(s));

	}

	// Metoda provjerava da li je SSN validan broj.
	public static boolean isValidSSN(String s) {

		// Provjeravamo duzinu SSN broja.
		if (s.length() != 11) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			// Provjerava da li su brojevi na pozicijama.
			if (i >= 0 && i <= 2 || i == 4 || i == 5 || i >= 7 && i <= 10) {
				// Ako nije broj vrati false.
				if (!isNumber(s.charAt(i))) {
					return false;
				}
			}

			// Provjerava da li su unijete povlake (-) na poziciji 4 i 7.
			if (i == 3 || i == 6) {
				// Ako nisu povlake vrati false.
				if (s.charAt(i) != '-') {
					return false;
				}
			}
		}
		// Ako je sve proslo bez greske vraca true;
		return true;
	}

	// Metoda provjerava da li je uneseni karakter broj.
	public static boolean isNumber(char n) {
		return (n >= '0' && n <= '9');
	}

}
