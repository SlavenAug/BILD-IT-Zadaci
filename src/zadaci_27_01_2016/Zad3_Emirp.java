/*
 * Emirp brojevi (prime unazad) je nepalindromski
 * prosti broj koji je prosti broj i kada ispišemo naopako. Na primjer,
 * broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi.
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 */
package zadaci_27_01_2016;

import zadaci_20_01_2016.Zad3_ReversePalindrom;
import zadaci_25_01_2016.Zad2_ProstiBrojevi;
import zadaci_26_01_2016.Zad3_ProstiBrojevi;

public class Zad3_Emirp {

	public static void main(String[] args) {
		
		// Postavljamo brojac za ispis po liniji.
		int brojac = 0;

		// Postavljamo petlju koja stalno vrti.
		for (int i = 2; i > 1; i++) {
			// Koristimo metode iz predhodnih zadataka.
			// Postavljamo uslov ako je broj prost i ako je
			// njegov broj obrnutih cifara prost broj.
			if (Zad2_ProstiBrojevi.isPrime(i) && Zad3_ProstiBrojevi.isPrime(Zad2_ReverseNumber.reverse(i))) {
				// Ispisujemo rezultat.
				System.out.print(i + " " + Zad2_ReverseNumber.reverse(i) + ", ");
				// Uvecavamo brojac.
				brojac++;
				// Ako je brojac djeljiv sa 10 printa novi red.
				if (brojac % 10 == 0) {
					System.out.println();
				}

				// Ako smo pronasli 100 emirp brojeva onda prekidamo petlju.
				if (brojac == 100) {
					break;
				}

			}
		}
	}

}
