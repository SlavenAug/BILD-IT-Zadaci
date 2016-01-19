/*
 *  ISBN-10 (International Standard Book Number) se sadrzi od 10 brojeva:
 *  d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, sluzi kao checksum i
 *  njega izracunavamo iz prvih devet brojeva koristeci se sljedecom formulom: 
 *  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 *  Ukoliko je checksum 10, zadnji broj oznacavamo sa X u skladu sa ISBN-10 konvencijom.
 *  Napisati program koji pita korisnika da unese prvih 9 brojeva te ispise desetocifreni ISBN-10 broj.
 *  (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 *  Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */
package zadaci_18_01_2016;
import methods.Unos;

public class Zad2_ISBNBroj {

	public static void isbn(int[] broj) {
		// Postavlja brojac na vrijednost 1.
		int brojac = 1;
		int checksum = 0;
		// Petlja koja racuna checksum.
		for (int i = 0; i < broj.length; i++) {
			checksum += broj[i] * brojac;
			// Inkrementuje brojac.
			brojac++;
		}
		// Dobijamo checksum ostatkom dijeljena sa 11.
		checksum = checksum % 11;
		System.out.println("ISBN broj je: ");
		// Ako je checksum 10, 10-ta cifra je X,
		// u suprotnom 10-ta cifra je checksum
		if (checksum == 10) {
			for (int i = 0; i < broj.length; i++) {
				System.out.print(broj[i]);
			}
			System.out.print("X");
		} else {
			for (int i = 0; i < broj.length; i++) {
				System.out.print(broj[i]);
			}
			System.out.print(checksum);
		}

	}

	public static void main(String[] args) {
		// Kreira niz za 9 brojeva.
		int[] broj = new int[9];
		System.out.println("Unesite prvih 9 ISBN brojeva:");
		for (int i = 0; i < broj.length; i++) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
			 * Metoda se nalazi u klasi Unos.
			 */
			broj[i] = Unos.inputInt();
		}
		// Pozivamo metodu i printamo ISBN broj.
		isbn(broj);
	}

}
