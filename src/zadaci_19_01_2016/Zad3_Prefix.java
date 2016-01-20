/*
 * Zadatak 3: Napisati program koji pita korisnika da unese 2 stringa
 * te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko
 * isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa
 * "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše:
 * Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */
package zadaci_19_01_2016;

import methods.Unos;

public class Zad3_Prefix {

	public static void main(String[] args) {
		// Unos dva stringa.
		System.out.println("Unesite prvi string: ");
		String rijec1 = Unos.stringNextLine();
		System.out.println("Unesite drugi string: ");
		String rijec2 = Unos.stringNextLine();
		// Pozivamo metodu za uporedjivanje unesenog texta.
		String prefix = prefix(rijec1, rijec2);
		// Prikazujemo zajednicki prefix.
		if (prefix == "") {
			System.out.println("Ne postoji zajednicki prefix!");
		} else {
			System.out.println("Zajednicki prefix je: " + prefix);
		}
	}

	public static String prefix(String prvi, String drugi) {
		String prefix = "";
		String temp;

		// Postavljamo prvi string za veci string.
		if (drugi.length() > prvi.length()) {
			temp = prvi;
			prvi = drugi;
			drugi = temp;
		}

		// Petljom pronalazimo prefix.
		for (int i = 0; i < drugi.length(); i++) {
			if (prvi.charAt(i) == drugi.charAt(i)) {
				prefix += prvi.charAt(i);
			} else
				break;
		}
		return prefix;
	}
}
