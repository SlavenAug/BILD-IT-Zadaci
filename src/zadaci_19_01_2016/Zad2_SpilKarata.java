/*
 * Napisati program koji simulira nasumièno izvlaèenje karte
 * iz špila od 52 karte. Program treba ispisati koja karta je
 * izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak
 * u kojem je data karta (Srce, Pik, Djetelina, Kocka).
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
package zadaci_19_01_2016;

import methods.Unos;

public class Zad2_SpilKarata {

	public static void main(String[] args) {
		// Postavljamo uslov petlje.
		int prekid = 1;
		while (prekid != 0) {
			System.out.println("Unesite bilo koji broj za novu kartu, 0 za kraj:");
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			prekid = Unos.inputInt();
			// Ako je unos 0 ispisuje poruku i izlazi iz programa.
			if (prekid == 0) {
				System.out.println("Izasli ste iz programa!");
				break;
			}
			// Pozivamo metodu koja ispisuje rezultat.
			spilKarata();
		}
	}

	public static void spilKarata() {
		// Kreira karte.
		int karta = (int) (Math.random() * 14) + 1;
		// Kreira znakove.
		System.out.println(karta);
		int znak = (int) (Math.random() * 4) + 1;
		System.out.println(znak);
		// Ispisuje rezultat.
		System.out.println(
				"Izvukli ste: " + ((karta == 1 || karta >= 11) ? karte(karta) : karta) + " " + znakKarta(znak));

	}

	// Metoda za dodjeljivanje imena kartama.
	public static String karte(int broj) {
		switch (broj) {
		case 1:
			return "A";
		case 11:
			return "A";
		case 12:
			return "J";
		case 13:
			return "Q";
		case 14:
			return "K";
		default:
			return "";
		}

	}

	// Metoda za dodjeljivanje znakova kartama.
	public static String znakKarta(int znak) {
		switch (znak) {
		case 1:
			return "Srce";
		case 2:
			return "Pik";
		case 3:
			return "Djetelina";
		case 4:
			return "Kocka";
		default:
			return "";
		}
	}
}
