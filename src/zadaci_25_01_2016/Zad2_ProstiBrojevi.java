/*
 * Zadatak 2: Napisati program koji ispisuje sve proste
 * brojeve od 2 do 1000, ukljućujući i 2 i 1000. Program
 * treba da ispiše 8 brojeva po liniji te razmak između
 * brojeva treba da bude jedan space.
 */
package zadaci_25_01_2016;

public class Zad2_ProstiBrojevi {

	public static void main(String[] args) {
		// Ulazimo u petlju.
		for (int i = 2, brojac = 0; i <= 1000; i++) {
			// Pozivamo metodu i akoje prosti broj ispisujemo ga.
			if (isPrime(i)) {
				// Ispisujemo proste brojeve, 8 po liniji.
				System.out.print(brojac % 8 == 0 ? "\n" + i + " " : i + " ");
				// Uvecavamo brojac.
				brojac++;
			}
		}

	}

	// Metoda za provjeru prostih brojeva.
	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			// Ako je broj djeljiv od 2 do
			// samog sebe onda nije prost broj
			if (number % i == 0) {
				// Ako nije prost broj vraca false.
				return false;
			}
		}
		// Ako je broj prost vraca true.
		return true;
	}

}
