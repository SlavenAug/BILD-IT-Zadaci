/*
 * Napisati program koji učitava cijele brojeve
 * u rasponu od 1 do 100 te broji i ispisuje koliko je koji
 * broj puta unijet. Pretpostavimo da nula prekida unos brojeva.
 * Ukoliko unesemo sljedeći niz brojeva 2 5 6 23 42 58 2 6 0
 * program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5
 * jednom, broj 6 2 puta, broj 23 jednom, itd.
 */
package zadaci_26_01_2016;

import methods.Unos;

public class Zad5_KolikoSePutaBrojPonovio {

	public static void main(String[] args) {

		// Kreiramo varijabli i postavljamo je za 1,
		// zbog ulaza u petlju.
		int num = 1;
		// Kreiramo niz za cuvanje brojeva.
		int[] niz = new int[101];

		System.out.println("Unesite brojeve u rasponu od 1 do 100, 0 za kraj;");
		while (num != 0) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			num = Unos.inputInt();
			// Ako je broj manji od 0 ili veci od 100 ispisuje poruku,
			// u suprotnom dodaje broj u niz.
			if (num < 0 || num > 100) {
				System.out.println("Unesite brojeve u rasponu od 1 do 100!");
				continue;
			} else {
				niz[num]++;
			}
		}

		// Pozivamo metodu za stampanje rezultata.
		printArray(niz);

	}

	public static void printArray(int[] niz) {
		for (int i = 1; i < niz.length; i++) {
			// Ne prikazuje elemente sa 0.
			if (niz[i] != 0) {
				System.out.println("Broj " + i + " se ponovio " + niz[i] + ". puta");
			}
		}
	}

}
