/*
 * Palindrome prime je prosti broj koji je također
 * i palindrom. Na primjer, 131 je palindrome prime, kao i
 * brojevi 313 i 757. Napisati program koji ispisuje
 * prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
 */
package zadaci_27_01_2016;

import zadaci_26_01_2016.Zad3_ProstiBrojevi;

public class Zad4_PalindromPrime {

	public static void main(String[] args) {
		// Postavljamo brojac.
		int brojac = 0;

		// Petlja koja vrti non stop.
		for (int i = 2; i > 1; i++) {
			/*
			 * Koristimo metode iz predhodnih zadataka. Ako je broj palindrom i
			 * ako je broj prost, ispisujemo rezultat, 10 brojeva po liniji.
			 */
			if (Zad2_ReverseNumber.reverse(i) == i && Zad3_ProstiBrojevi.isPrime(i)) {
				System.out.print((brojac % 10 == 0 ? "\n" + i : i) + " ");
				brojac++;
				// Kada brojac dostigne 100 brojeva onda prekidamo petlju.
				if (brojac == 100) {
					break;
				}
			}

		}

	}

}
