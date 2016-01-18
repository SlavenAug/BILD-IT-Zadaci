package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1_NajvecaVrijednostListe {

	
	public static Integer max(ArrayList<Integer> list) {
		/*
		 * Provjeravamo da li je ista prazna
		 * ako jest, vraca null
		 * u suprotnom vraca najveci element liste
		 */

		if (list == null || list.isEmpty()) {
			return null;
		} else {
			// Sortira listu
			Collections.sort(list);
			// Uzima zadnji clan liste, tj. najveci
			int max = list.get(list.size() - 1);
			return max;
		}
	}

	
	
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		int prekid = 1;  // Postavljamo uslov petlje
		// Kreiramo listu
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Unesite brojeve, 0 za kraj: ");
		
		while (prekid != 0) {
			try {
				int broj = unos.nextInt();
				if (broj == 0) {  // Ako je unos 0, prekidamo petlju
					prekid = 0;
				} else {         // u suprotnom dodajemo broj listi
 					list.add(broj);
				}
			} catch (InputMismatchException e) {
				System.out.println("Niste unijeli cijeli broj, pokusajte ponovo!");
				unos.nextLine();
			}

		}
		
		
        // Ispisuje najveci broj u listi
		System.out.println("Najveci broj u listi je: " + max(list));
		// Zatvaramo unos
		unos.close();
		
		
	}
	
}
