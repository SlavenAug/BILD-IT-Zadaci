/*
 * Napisati metodu koja vraca lokaciju najveceg elementa u 2D nizu.
 * Metoda treba da koristi sledeci header:
 * public static int[] locateLargest(double[][] a)
 * Napisati test program koji pita korisnika da unese 2D niz
 * te mu ispisuje lokaciju najveceg elementa u nizu.
 */

package zadaci_17_01_2016;

import methods.Unos;

public class Zad4_NajveciElementNiza {

	public static int[] locateLargest(double[][] a) {

		// Niz u kome se cuvaju indexi najveceg elementa niza.
		int[] index = new int[2];
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// Ako je trenutni element niza veci od sacuvanog,
				// cuva indexe tog elementa.
				if (a[i][j] > max) {
					max = a[i][j];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		// Vraca indexe najveceg elementa.
		return index;
	}

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite broj redova niza:");
		int redovi = Unos.inputInt();
		System.out.println("Unesite broj kolona niza");
		int kolone = Unos.inputInt();
		double[][] niz = new double[redovi][kolone];
		System.out.println("Unesite 2D niz " + redovi + "x" + kolone);

		// Unosi elemente u 2D niz.
		for (int i = 0; i < niz.length; i++) {
			for (int k = 0; k < niz[i].length; k++) {
				niz[i][k] = Unos.inputDouble();
			}
		}

		// Ispisuje 2D niz.
		for (int i = 0; i < niz.length; i++) {
			for (int k = 0; k < niz[i].length; k++) {
				System.out.print(niz[i][k] + " ");
			}
			System.out.println();
		}

		int[] max = locateLargest(niz);
		System.out.println("Lokacija najveceg elementa 2D niza je: " + max[0] + "," + max[1]);

	}

}
