/*
 * Napisati program koji ucitava neodredjen broj cijelih brojeva
 * (nula prekida unos) te ispisuje koliko je brojeva bilo iznad
 * ili jednako prosjeku svih unesenih brojeva, a koliko je bilo
 * brojeva ispod prosjeka. Maksimalan niz brojeva koje korisnik
 * moze unijeti je 100.
 */
package zadaci_18_01_2016;
import java.util.ArrayList;
import methods.Unos;

public class Zad5_ProsjekBrojeva {

	public static void prosjek(ArrayList<Integer> num) {
		// Kreiramo varijable.
		double prosjek = 0;
		int suma = 0;
		// Kreiramo brojace.
		int ispod = 0;
		int iznad = 0;
		int jednako = 0;

		// Petlja koja izracunava sumu svih brojeva.
		for (int i = 0; i < num.size(); i++) {
			suma += num.get(i);
		}

		// Racunamo prosjek brojeva.
		prosjek = suma / num.size();

		for (int i = 0; i < num.size(); i++) {
			// Ako je trenutni broj jednak prosjeku uvecavamo brojac.
			if (num.get(i) == prosjek) {
				jednako++;
				// Ako je trenutni broj veci od prosjeka uvecavamo brojac,
				// u suprotnom uvecavamo brojac za brojeve ispod prosjeka.
			} else if (num.get(i) > prosjek) {
				iznad++;
			} else {
				ispod++;
			}
		}
		// Printamo rezulte.
		System.out.println("Prosjek brojeva je: " + prosjek);
		System.out.println("Brojeva jednako prosjeku: " + jednako);
		System.out.println("Brojeva iznad prosjeka: " + iznad);
		System.out.println("Brojeva ispod prosjeka: " + ispod);

	}

	public static void main(String[] args) {
		// Kreira listu.
		ArrayList<Integer> num = new ArrayList<>();
		// Postavljamo brojac.
		int brojac = 0;
		// Postavljamo uslov petlje.
		int broj = 1;

		while (broj != 0 || brojac == 100) {
			System.out.println("Unesite broj, 0 za prekid: ");
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
			 * Metoda se nalazi u klasi Unos.
			 */
			broj = Unos.inputInt();
			if (broj != 0) {
				brojac++;
			}
			// Ako je korisnik unio 0, onda prekidamo unos,
			// 0 se ne upisuje u listu.
			if (broj == 0) {
				break;
			}
			num.add(broj);
		}
		// Pozivamo metodu.
		prosjek(num);
	}

}
