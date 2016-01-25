/*
 * Napisati program koji učitava neodređen broj
 * cijelih brojeva, određuje koliko je pozitivnih brojeva
 * korisnik unijeo, koliko negativnih te izračunava ukupnu sumu
 * i prosjek svih unesenih brojeva. (Korisnik prekida unos tako
 * što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program
 * treba da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma
 * ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */
package zadaci_25_01_2016;

import methods.Unos;

public class Zad5_SumaPozitivniNegativniProsjekBrojeva {

	public static void main(String[] args) {
		
		// Kreiramo varijablu.
		int broj = 1;
		// Brojac za pozitivne brojeve.
		int pozitivni = 0;
		// Brojac za negativne brojeve.
		int negativni = 0;
		// Suma unesenih brojeva.
		double suma = 0;

		// Vrti petlju sve dok se ne unese 0.
		while (broj != 0) {
			System.out.println("Unesite broj, 0 za kraj");
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			broj = Unos.inputInt();
			// Ako je broj veci od 0 uvecavamo brojac pozitivni,
			// u suprotnom uvecavamo brojac negativni.
			if (broj > 0) {
				pozitivni++;
			} else if (broj < 0) {
				negativni++;
			}
			// Raucuna sumu brojeva.
			suma += broj;
		}

		// Racunanje prosjeka.
		double prosjek = suma / (pozitivni + negativni);

		// Ispisujemo rezultat.
		System.out.println("Broj pozitivnih brojeva: " + pozitivni + "\nBroj negativnih brojeva: " + negativni
				+ "\nSuma svih brojeva: " + suma + "\nProsjek svih brojeva:" + prosjek);

	}
}
