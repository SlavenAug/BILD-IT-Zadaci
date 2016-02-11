/*
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers.
 * public static void shuffle(ArrayList<Integer> list)
 */
package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zad5_ShuffleArrayList {

	public static void main(String[] args) {

		// Kreiramo listu.
		ArrayList<Integer> list = new ArrayList<>();
		// Dodajemo u listu 100 objekta.
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		// Ispisujemo listu.
		printArrayList(list);
		// Pozivamo metodu za shuffle liste.
		shuffle(list);
		// Prikazujemo izmjesanu listu.
		System.out.println("\n\nShuffled list:");
		printArrayList(list);
	}

	// Metod za mijesanje elemenata u listi.
	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < 256; i++) {
			// pozivamo metod swap iz Collecions koji mijenje elemente u listi
			// na odredjenim indeksima. indeksi su random generisani
			Collections.swap(list, (int) (Math.random() * list.size()), (int) (Math.random() * list.size()));
		}
	}

	// Metod prikazuje sadrzaj liste, 10 elemenata po redu.
	public static void printArrayList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i % 10 == 0 ? "\n" + list.get(i) : " " + list.get(i)));
		}
	}
}
