/*
 * Napisati program koji pita korisnika da unese neki cijeli broj,
 * te ispisuje njegove najmanje faktore u rastucem redosljedu.
 * Na primjer, ukoliko korisnik unese 120 program treba da 
 * ispise 2,2,2,3,5.
 */

package zadaci_18_01_2016;
import methods.Unos;

public class Zad1_NajmanjiFaktoriBroja {
	
	public static void faktori(int n) {
		// Postavljamo brojac za 2 s koijim dijelimo
		// korisnikov unos.
		int brojac = 2;
		// Vrti petlju sve dok je korisnikov unos veci od 1.
		while (n > 1) {
			// Ako je unos djeljiv sa brojacem, ispisujemo brojac
			// i postavljamo pocetnu vrijednost brojaca na 2, 
			// takodje dodjeljujemo novu vrijednost unosa.
			if (n % brojac == 0) {
				System.out.println(brojac + " ");
				n = n / brojac;
				brojac = 2;
			} else {  // Ako unos nije djeljiv sa brojacem, inkrementujemo brojac.
				brojac++;
			}

		}
	}

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite broj: ");
		faktori(Unos.inputInt());

	}

}
