/*
 * Napisati metodu koja pronalazi broj
 * ponavljanja odre�enog karaktera u stringu. Metoda
 * treba da koristi sljede�i header:
 * public static int count(String str, char a). Na primjer,
 * ukoliko pozovemo metodu na sljede�i na�in: count("Welcome", e)
 * metoda treba da vrati 2. Napisati program koji pita korisnika
 * da unese string i koji karakter �eli da prebroji u datom
 * stringu te mu ispi�e koliko se puta odre�eni karakter
 * ponovio u zadatom stringu.
 */
package zadaci_24_01_2016;

import methods.Unos;

public class Zad4_PonavljanjeKarakteraStringa {

	public static void main(String[] args) {
		// Kreiramo varijable.
		System.out.println("Unesite string: ");
		String s = Unos.stringNextLine();
		System.out.println("Unesite karakter: ");
		char c = Unos.stringNext().charAt(0);

		// Pozivamo metodu i ispisujemo rezultat.
		System.out.println("U stringu " + s + " karakter " + c 
				+ " se ponovio " + count(s, c) + " puta.");
	}

	// Metoda koja broji duple karaktere stringa.
	public static int count(String str, char a) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i)) {
				brojac++;
			}
		}
		return brojac;
	}

}
