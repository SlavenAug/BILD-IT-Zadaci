/*
 * Zadatak 4: Pozitivni  cijeli broj je savršen broj
 * ukoliko je jednak zbiru svih svojih pozitivnih djelilaca,
 * iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj
 * jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer
 * 28 = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje
 * u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.
 */
package zadaci_21_01_2016;

public class Zad4_SavrseniBrojevi {
	
	public static void main(String[] args) {
		
		System.out.println("Savrseni brojevi od 0 do 10000 su: ");
		for (int i = 1; i <= 10000; i++) {
			if (isPerfect(i)) {
				// Ako je trenutni provjereni broj savrsen, ispisi ga.
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPerfect(int number) {
		// Rezulta zbira savrsenog broja.
		int perfect = 0;
		// Provjera svih djelilaca broja.
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				// Sabiranje svih djelilaca broja.
				perfect += i;
			}
		}
		// Provjera da li je savrsen broj jednak svojim djeliocima.
		return perfect == number;
	}
	
	

}
