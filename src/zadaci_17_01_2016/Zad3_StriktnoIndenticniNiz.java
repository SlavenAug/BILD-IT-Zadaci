/*
 * Nizovi niz1 i niz2 su striktno indenticni ukoliko su svi elementi
 * na istim pozicijama jednaki. Napisati metodu koja vraca true
 * ukoliko su nizovi niz1 i niz2 striktno indenticni. Koristeci sledeci header;
 * public static boolean equals(int [] niz1, int [] niz2)
 * Napisati testni program koji pita korisnika da unese dva niza
 * cijelih brojeva te provjerava da li su striktno indenticni.
 */

package zadaci_17_01_2016;

import methods.Unos;

public class Zad3_StriktnoIndenticniNiz {
	

	public static boolean equals(int[] niz1, int[] niz2) {
		
		// Petljom prolazimo kroz elemente oba niza.
		for (int i = 0; i < niz1.length; i++) {
			// Ako element niza1 nije jednak elementu niza2
			// vraca false.
			if (niz1[i] != niz2[i]) {
				return false;
				
			}
		}
		// Niz je striktno indentican.
		return true;
	}

	
	public static void main(String[] args) {
		
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite velicninu za niz brojeva:");
		// Korisnikov unos velicine niza.
		int velicina = Unos.inputInt();
		// Kreira niz1.
		int[] niz1 = new int[velicina];
		// Kreira niz1.
		int[] niz2 = new int[velicina];

		System.out.println("Unesite " + velicina + " broja/brojeva za prvi niz: ");
		// Popunjava korisnikov unos u niz.
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = Unos.inputInt();
		}

		System.out.println("Unesite " + velicina + " brojeva za drugi niz: ");
		// Popunjava korisnikov unos u niz.
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = Unos.inputInt();
		}

		// Poziva metodu, ispisuje poruku u zavisnosti da li je false ili true.
		if (equals(niz1, niz2) == false) {
			System.out.println("Unesena dva niza nisu striktno indenticna!");
		} else {
			System.out.println("Unesena dva niza su striktno indenticna!");
		}
	}
}
