/*
 * Napisati metodu koja nalazi najmanji element u 
 * nizu decimalnih vrijednosti koristeci se sledecim headerom:
 * public static double min (double[]array):
 * Napisite potom test program koji pita korisnika da unese deset brojeva
 * te poziva ovu metodu da vrati najmanji element u nizu.
 */

package zadaci_17_01_2016;
import methods.Unos;

public class Zad2_NajmanjiElementNiza {

	public static double min(double[] array) {

		// Kreira varijablu za odredjivanje
		// najmanje vrijednosti niza.
		double min = array[0];

		// Prolazimo kroz petlju trazeci najmanji element niza
		for (int i = 1; i < array.length; i++) {
			// Ako je trenutni broj niza manji od najmanje vrijednosti
			// onda je najmanja vrijednost jednaka trenutnom broju niza.
			if (array[i] < min) {
				min = array[i];
			}
		}
		// Vraca najmanji element niza.
		return min;
	}

	public static void main(String[] args) {
		
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite duzinu niza: ");
		// Unos duzine niza.
		int duzina = Unos.inputInt();
		// Kreira niz duzine korisnikovog unosa.
		double[] array = new double[duzina];
		System.out.println("Unesite " + duzina + " decimalnih brojeva: ");
		// Popunjava korisnikov unos u niz.
		for (int i = 0; i < array.length; i++) {
			array[i] = Unos.inputDouble();
		}

		// Poziva metodu za pronalazenje najmanjeg elementa niza i ispisuje isti.
		System.out.println("Najmanji element niza je: " + min(array));
	}
}
