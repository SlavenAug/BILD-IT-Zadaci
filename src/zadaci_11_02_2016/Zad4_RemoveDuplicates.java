/*
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space.
 */
package zadaci_11_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad4_RemoveDuplicates {

	public static void main(String[] args) {
		final int num = 10;
		// Kreiramo lisut.
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		System.out.println("Enter " + num + " int value: ");
		while (count < 10) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
			 * programa. Metoda se nalazi u klasi Unos.
			 */
			// Unosimo elemente u lisut.
			list.add(Unos.inputInt());
			// Uvecavamo brojac nakon unosa.
			count++;
		}
		// Pozivamo metodu za brisanje duplikata.
		removeDuplicate(list);
		// Poziv metode za ispis elemenata u listi.
		print(list);
	}

	// Meotd za odstranjivanje duplih elemenata u listi.
	public static void removeDuplicate(ArrayList<Integer> list) {
		// Postavljamo uslov ako je manji od duzine liste.
		for (int i = 0; i < list.size() ; i++) {
			for (int j = 0; j < list.size() ; j++) {
				// izbjegavamo poredjenje elemenata na istoj poziciji
				if (i != j) {
					// ako su iste vrijednosti provjerenih elemenata
					if (list.get(i) == list.get(j)) {
						// odstrani elemenat na j poziciji
						list.remove(j);
						break;
					}
				}
			}
		}
	}

	// Metod za prikaz elemenata u listi.
	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

}
