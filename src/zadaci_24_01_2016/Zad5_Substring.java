/*
 * Napisati program koji pita korisnika da unese dva
 * stringa te provjerava i ispisuje da li je drugi string substring
 * prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi
 * string a BC kao drugi string program mu ispisuje da je BC
 * substring ABCD stringa.
 */
package zadaci_24_01_2016;

import methods.Unos;

public class Zad5_Substring {
	public static void main(String[] args) {
		// Kreiramo varijable.
		System.out.println("Unesite prvi string:");
		String s1 = Unos.stringNextLine();
		System.out.println("Unsite drugi string:");
		String s2 = Unos.stringNextLine();

		// Ispisujemo rezultat.
		System.out.println(isSubstring(s1, s2) ? s2 + " jest substrint " + s1 + " stringa"
				: s2 + " nije substrint " + s1 + " stringa");
	}

	// Metoda koja provjerava substring.
	public static boolean isSubstring(String s1, String s2) {
		// Ako prvi string  sadrzi drugi 
		// onda je drugi substring i metoda vcra true.
		if (s1.contains(s2)) {
			return true;
		}
		return false;
	}

}
