/*
 * Napisati metodu koja pronalazi broj
 * ponavljanja odreðenog karaktera u stringu. Metoda
 * treba da koristi sljedeæi header:
 * public static int count(String str, char a). Na primjer,
 * ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e)
 * metoda treba da vrati 2. Napisati program koji pita korisnika
 * da unese string i koji karakter želi da prebroji u datom
 * stringu te mu ispiše koliko se puta odreðeni karakter
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
