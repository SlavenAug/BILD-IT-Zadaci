/*
 * Napisati program koji prima 10 cijelih
 * brojeva te ih ispisuje u obrnutom redosljedu. 
 */
package zadaci_19_01_2016;

import methods.Unos;

public class Zad4_ObrnutiBrojevi {
	public static void main(String[] args) {
		// Kreiramo niz velicine 10.
		int[] niz = new int[10];

		// Unos brojeva u niz.
		System.out.println("Unesite " + niz.length + " brojeva");
		for (int i = 0; i < niz.length; i++) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			niz[i] = Unos.inputInt();
		}

		// Pozivamo metodu koja ispisuje brojeve
		// u obrnutom redosljedu.
		obrnutiBrojevi(niz);
	}

	public static void obrnutiBrojevi(int[] niz) {
		// Petlja vraca brojeve u obrnutom redosljedu.
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.println(niz[i] + " ");
		}
	}
}
