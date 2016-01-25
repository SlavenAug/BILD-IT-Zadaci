/*
 * Napisati program koji pita korisnika da unese
 * imena tri grada te ih ispiše u abecednom redu.
 * Na primjer, ukoliko korisnik unese Chicago, Los
 * Angeles i Atlanta kao gradove, program vraća
 * Atlanta, Chicago, Los Angeles.
 */
package zadaci_25_01_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad1_GradoviPoAbecednomRedu {

	public static void main(String[] args) {

		// Kreiramo listu za stringove.
		ArrayList<String> list = new ArrayList<>();
		// Unos tri stringa.
		for (int i = 1; i <= 3; i++) {
			System.out.println("Unesite ime " + i + ". grada");
			list.add(Unos.stringNextLine());
		}
		// Sortiramo stringove.
		list.sort(null);
		// Ispisujemo sortirane stringove.
		for (int i = 1; i <= 3; i++) {
			System.out.println(list.get(i - 1));
		}
	}

}
