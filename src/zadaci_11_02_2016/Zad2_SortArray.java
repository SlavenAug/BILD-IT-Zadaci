/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.
 */
package zadaci_11_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad2_SortArray {

	public static void main(String[] args) {
		// kreiranje liste
		ArrayList<Integer> list = new ArrayList<>();
		// brojac postavljamo na nulu
		int count = 0;
		System.out.println("Enter 5 int value: ");
		// Petlja vrti sve dok je brojac manji od 5.
		while (count < 5) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
			 * Metoda se nalazi u klasi Unos.
			 */
			list.add(Unos.inputInt());
			// Uvecavamo brojac.
			count++;
		}
		// Pozivamo metodu za sortiranje liste.
		sortArray(list);
		// Prikazujemo listu.
		System.out.println(list);
	}

	// Metoda sortira listu.
	public static void sortArray(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				// Ako je trenutni elemenat j veci od i,
				if (list.get(i) < list.get(j)) {
					// sacuvaj vrijednost elementa na i indexu u temp
					int temp = list.get(i);
					// prekopiraj sadrzaj j elementa preko i elementa
					list.set(i, list.get(j));
					// prekopiraj vrijednost iz temp
					// na poziciji j elementa
					list.set(j, temp);
				}
			}
		}
	}

}
