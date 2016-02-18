/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 */
package zadaci_17_02_2016;

import java.util.ArrayList;

public class Zad5_SortArrayList {

	public static void main(String[] args) {
		// Kreiramo listu.
		ArrayList<Number> lista = new ArrayList<>();
		// Dodajemo brojeve u listu.
		lista.add(999);
		lista.add(1.5);
		lista.add(3456789);
		lista.add(285);
		lista.add(432545634);
		lista.add(324);
		lista.add(100);
		lista.add(-80);
		lista.add(-15);
		lista.add(5);
		// Prikaz stanja prije srotiranja.
		System.out.println(lista);
		// Pozivamo metodu za sortiranje.
		sort(lista);
		// Prikazujemo sortiranu listu.
		System.out.println(lista);
	}

	// Metod za sortiranje elemenata u listi po rastucem redu.
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				// Ako je vrijadnost elementa na idneksu i manja od vrijednosti
				// elementa na idneksu j, zamijeni im pozicije.
				if (list.get(i).doubleValue() < list.get(j).doubleValue()) {
					// Cuvamo elemenat sa drugog indeksa u temp varijabli.
					Number temp = list.get(j);
					// Kopiramo elemenat sa prvog indeksa preko drugog elementa.
					list.set(j, list.get(i));
					// Kopiramo temp (drugi elemenat) preko prvog elementa.
					list.set(i, temp);
				}
			}
		}
	}
}
