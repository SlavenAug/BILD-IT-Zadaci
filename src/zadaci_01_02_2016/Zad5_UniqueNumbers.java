/*
 * Napisati program koji učitava 10 brojeva te ispisuje koilko
 * je jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
 * broj treba ispisati samo jednom.
 */
package zadaci_01_02_2016;

import java.util.Arrays;

import methods.Unos;

public class Zad5_UniqueNumbers {

	public static void main(String[] args) {
		// Kreiramo niz.
		int[] niz = new int[10];

		System.out.println("Unesite 10 brojeva:");
		// Unos brojeva u niz.
		for (int i = 0; i < 10; i++) {
			niz[i] = Unos.inputInt();
		}

		for (int i = 0; i < niz.length; i++) {
			for (int k = 0; k < niz.length; k++) {
				// Ne provjeravamo iste indexe niza.
				if (i != k) {
					// Ako je ista vrijednost postavljamo nulu.
					if (niz[i] == niz[k]) {
						niz[i] = 0;
					}
				}
			}
		}

		// Sortiramo niz.
		Arrays.sort(niz);

		// Ispisujemo brojeve.
		for (int i = 0; i < niz.length; i++) {
			// Ako je broj razlicit od nule.
			if (niz[i] != 0) {
				System.out.print(niz[i] + " ");
			}
		}

	}

}