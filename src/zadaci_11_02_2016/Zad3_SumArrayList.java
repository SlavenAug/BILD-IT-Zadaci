/*
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 */
package zadaci_11_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad3_SumArrayList {

	public static void main(String[] args) {
		// Kreiramo listu.
		ArrayList<Double> list = new ArrayList<>();
		// Brojac postavljamo na nulu.
		int counter = 0;
		System.out.println("Enter 5 double value: ");
		// Petlja vrti sve dok je brojac manji od 5.
		while (counter < 5) {
			/*
			 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
			 * Metoda se nalazi u klasi Unos.
			 */
			// Unosimo brojeve u listu.
			list.add(Unos.inputDouble());
			// Inkrementiramo brojac posle svakog unesenog elementa.
			counter++;
		}
		// Pozivamo metodu i ispisujemo rezultat.
		System.out.println("Sum of elements in a list is: " + sum(list));

	}

	// Metod sabira elemente u listi, te vraca njihovu sumu.
	public static double sum(ArrayList<Double> list) {
		// Kreiramo sumu i postavljamo je na 0.
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			// Uzimamo svaki elemenat u nizu i dodajemo njegovu vrijednost u
			// sumu.
			sum += list.get(i);
		}
		// Vracamo sumu svih brojeva.
		return sum;
	}

}
