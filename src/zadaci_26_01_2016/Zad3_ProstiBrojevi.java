/*
 * Napisati metodu sa sljedećim headerom:
 * public static int isPrime(int n)
 * koja provjerava da li je broj prost/prime.
 * Napsati test program koji poziva ovu metodu
 * i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
package zadaci_26_01_2016;

public class Zad3_ProstiBrojevi {

	public static void main(String[] args) {
		// Kreiramo brojac za ispis po liniji.
		int brojac = 0;
		// Petlja koja vrti cijeli proces.
		for (int i = 2; i <= 100000; i++) {
			// Ako je trenutni broj prost ispisujemo ga.
			if (isPrime(i)) {
				// Ispisujemo 10 prostih brojeva po liniji.
				System.out.print((brojac % 10 == 0 ? "\n" + i : i) + " ");
				// Uvecavamo brojac za svaki ispisani broj.
				brojac++;
			}
		}

	}

	// Metoda pronalazi proste brojeve.
	public static boolean isPrime(int n) {
		// Petlja koja vrti cijeli proces.
		// Ako je broj djeljiv sa prethodnicima,
		// onda taj broj nije prost i metoda vraca false,
		// u suprotnom vraca true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
