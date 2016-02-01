/*
 * 
 * Napisati program koji prima ASCII kod (cijeli broj između 0 i 127)
 * te ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII kod,
 * program mu ispisuje da je karakter sa tim brojem karakter E.
 */
package zadaci_01_02_2016;

import methods.Unos;

public class Zad1_ASCII {

	public static void main(String[] args) {
		// Pozivamo metodu i ispisujemo ASCII karakter.
		System.out.println("ASCII character is: " + ascii());

	}

	// Metoda vraca karakter za uneseni ASCII kod.
	public static char ascii() {
		int ascii = 0;
		boolean prekid = true;

		while (prekid) {
			System.out.println("Enter ASCII code: ");
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			ascii = Unos.inputInt();
			// Izlazi iz petlje ako je broj u granici ASCII koda.
			if (ascii >= 0 && ascii <= 127) {
				prekid = false;
			} else {
				// Ako nije obavjestava korisnika da proba ponovo.
				System.out.println("ASCII range is from 0 to 127!");
			}
		}
		return (char) ascii;
	}

}
