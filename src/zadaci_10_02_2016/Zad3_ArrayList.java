/*
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0, and invokes this method to return the largest number in the input.
 */
package zadaci_10_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad3_ArrayList {

	public static void main(String[] args) {

		// Kreiramo listu.
		ArrayList<Integer> list = new ArrayList<>();

		// Petlja za unos brojeva.
		int input = -1;
		while (input != 0) {
			System.out.println("Enter an integer! (0 for exit)");
			// unos od korisnika
			input = Unos.inputInt();
			// Sprijecavamo da se nula ne doda u listu.
			if (input != 0) {
				list.add(input);
			}
		}
		// poziv metoda za pronalazenje max elementa u listi.
		System.out.println("Max value in the list is: " + max(list));

	}

	// Metod za pronalazenje najveceg elementa u listi.
	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty()) {
			return null;
		}
		// Postavljamo prvu vrijednost iz liste.
		Integer max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			// Ako je trenutni elementat veci od max.
			if (max < list.get(i)) {
				// prebaci ga u max.
				max = list.get(i);
			}
		}
		// Vrati najveci pronadjeni elemenat u listi
		return max;
	}
}
