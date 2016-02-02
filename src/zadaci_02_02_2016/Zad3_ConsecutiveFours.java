/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same
 * value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series. Here are sample runs:
 * Enter the number of values: 8
 * Enter the values: 3 4 5 5 5 5 4 5
 * The list has consecutive fours
 * 
 * Enter the number of values: 9
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * The list has no consecutive fours
 */
package zadaci_02_02_2016;

import methods.Unos;

public class Zad3_ConsecutiveFours {

	public static void main(String[] args) {
		// Pozivamo metode i ispisujemo rezultat.
		System.out.println("The list has " + (isConsecutiveFour(array()) ? "" : "no ") + " consecutive fours");
	}

	// Metoda za kreiranje niza.
	public static int[] array() {
		System.out.println("Enter the numbers of values: ");
		int[] arr = new int[Unos.inputInt()];
		System.out.println("Enter the values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Unos.inputInt();
		}
		return arr;
	}

	// Metoda provjerava da li se u nizu nalaze 4 ista uzastopna elementa.
	public static boolean isConsecutiveFour(int[] values) {
		// Postavljamo brojac.
		int counter = 0;
		// Uzimamo prvi element niza.
		int same = values[0];

		for (int i = 0; i < values.length; i++) {
			if (same == values[i]) {
				// Ako su elementi isti povecavamo brojac.
				counter++;
				// Ako je brojac dostigao vrijednost 4 vraca true;
				if (counter >= 4) {
					return true;
				}
			} else {
				// Dodajemo novu vrijednost u varijabli za
				// poredjenje i postavljamo brojac na 1.
				same = values[i];
				counter = 1;
			}
		}
		// Vracamo false ako nisu pronadjena 4 ista uzastopna broja.
		return false;
	}

}
