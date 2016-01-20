/*
 * Zadatak 5: Napisati metodu koja broji slova u stringu.
 * Metoda treba koristiti sljedeæi header:
 * public static int countLetters(String s). Napisati program
 * koji pita korisnika da unese neki string te mu vrati
 * koliko taj string ima slova.
 */
package zadaci_19_01_2016;

import methods.Unos;

public class Zad5_BrojiSlovaStringa {

	public static void main(String[] args) {
		// Kreiramo string
		System.out.println("Unesite string:");
		String s = Unos.stringNextLine();

		// Pozivamo metodu i ispisujemo rezultat.
		System.out.println("Uneseni string ima: " + countLetters(s) + " slova:");

	}

	public static int countLetters(String s) {
		// Postavljamo brojac slova
		int brojac = 0;

		for (int i = 0; i < s.length(); i++) {
			// Ako je trenutni karakter slovo, inkrementujemo brojac.
			if (Character.isLetter(s.charAt(i))) {
				brojac++;
			}
		}
		// Vraca koliko je slova pronadjeno u stringu.
		return brojac;
	}
}
