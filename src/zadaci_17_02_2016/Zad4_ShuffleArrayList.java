/*
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 */
package zadaci_17_02_2016;

import java.util.ArrayList;

public class Zad4_ShuffleArrayList {

	public static void main(String[] args) {
		// Kreiramo listu.
		ArrayList<Number> list = new ArrayList<>();
		// Dodajemo brojeve u listu.
		list.add(1);
		list.add(7);
		list.add(1346);
		list.add(122.4);
		list.add(567654);
		list.add(0.5);
		list.add(787);
		// Prikazujemo trenutno stanje liste.
		System.out.println(list);
		// Pozivamo metod za mijesanje elemenata u listi.
		shufleArray(list);
		// Prikazujemo stanje liste posle mijesanja.
		System.out.println(list);
	}

	// Metod za nasumicno mijesanje elemenata u listi.
	public static void shufleArray(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			// generisemo prvi indeks.
			int indx1 = (int) (Math.random() * list.size());
			// generisemo drugi index.
			int indx2 = (int) (Math.random() * list.size());
			// cuvamo elemenat sa prvog indeksa.
			Number temp = list.get(indx1);
			// Kopiramo elemenat sa drugog indeksa preko prvog elementa.
			list.set(indx1, list.get(indx2));
			// Kopiramo temp (prvi elemenat) preko drugog elementa.
			list.set(indx2, temp);
		}
	}
}
