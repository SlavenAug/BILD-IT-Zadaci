/*
 *  (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 */
package zadaci_10_02_2016;

import java.util.ArrayList;

public class Zad4_ArrayListObjects {

	public static void main(String[] args) {
		
		// Kreiramo objekte.
		ArrayList<Object> lista = new ArrayList<>();
		lista.add(new Zad1_Triangle(4.5, 2.4, 7.9));
		lista.add(new Zad1_GeometricObject("blue", true));
		lista.add(new Zad2_Student("Slaven", "Barici", 387653882, "slaven.aug@gmail.com", 1));
		
		// Ispisujemo objekte.
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
	}
}
