/*
 * apisati program koji pita korisnika da unese
 * cijeli broj te ispisuje piramidu svih brojeva do tog broja.
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1,
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3,
 * red ispod 4 3 2 1 2 3 4 itd.)
 */
package zadaci_30_01_2016;

import methods.Unos;

public class Zad5_Piramida {

	public static void main(String[] args) {
		System.out.println("Unesite cijeli broj: ");
		int num = Unos.inputInt();

		for (int i = 1; i <= num; i++) {
			// Petlja koja prikazuje lijevi dio piramide.
			for (int j = num; j > 0; j--) {
				/*
				 * Ako je j manje ili jednako i prikazuje j i prazno polje, u
				 * suprotnom prikazuje dva prazna polja.
				 */
				System.out.print((j <= i) ? j + " " : "  ");
			}
			// Petlja prikazuje desni dio piramide.
			for (int k = 2; k <= num; k++) {
				System.out.print((k <= i) ? k + " " : "  ");
			}
			// Ispisuje novi red.
			System.out.println();
		}
	}

}
