/*
 * (Combine two lists) Write a method that returns the union of two array lists of
 * integers using the following header:
 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated by
 * exactly one space in the output.
 */
package zadaci_11_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad5_CombineTwoLists {

	public static void main(String[] args) {
		// poziv metoda za kreiranje liste
		System.out.print("Enter five integers for list1: ");
		ArrayList<Integer> list1 = createList();

		System.out.print("Enter five integers for list2: ");
		ArrayList<Integer> list2 = createList();
		// poziv metoda union() u metodi za prikaz elemenata liste
		Zad4_RemoveDuplicates.print(union(list1, list2));

	}

	// Metod kreira uniju elementa dvije liste.
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// nova lista koja cuva uniju elementa liste1 i liste2
		ArrayList<Integer> union = new ArrayList<>();
		// Dodavanje prve liste u uniju.
		for (int i = 0; i < list1.size(); i++) {
			union.add(list1.get(i));
		}
		// Dodavanje druge liste u uniju.
		for (int i = 0; i < list2.size(); i++) {
			union.add(list2.get(i));
		}
		// Unija elementata.
		return union;
	}

	// Metod sluzi za kreiranje liste i unosa elemenata.
	public static ArrayList<Integer> createList() {
		// kreiranje liste
		ArrayList<Integer> list = new ArrayList<>();
		// brojac postavljamo na nulu
		int count = 0;
		while (count < 5) {
			// Unosimo elemente u listu.
			list.add(Unos.inputInt());
			// Inkrementiramo brojac posle svakog unesenog elementa.
			count++;
		}
		// Nova kreirana lista sa unesenim elementima.
		return list;
	}

}
