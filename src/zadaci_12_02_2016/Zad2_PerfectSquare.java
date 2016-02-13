/**
 *(Algebra: perfect square) Write a program that prompts the user to enter an integer
* m and find the smallest integer n such that m * n is a perfect square. (Hint:
* Store all smallest factors of m into an array list. n is the product of the factors that
* appear an odd number of times in the array list. For example, consider m = 90,
* store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
* in the array list. So, n is 10.) Here are sample runs:
*/
package zadaci_12_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad2_PerfectSquare {

	public static void main(String[] args) {
		System.out.print("Enter an integer m: ");
		// Unosimo broj.
		int m = Unos.inputInt();
		// Pronalazi faktor.
		int n = oddFactors(factors(m));
		// ispisujemo rezultat
		System.out.println("The smallest number n for m * n to be a perfect square is " + n + "\nm * n is " + (m * n));
	}

	// Metod pronalazi sve faktore za dati broj.
	public static ArrayList<Integer> factors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		// petlje koj izdvaja poste faktore broja n
		// petlja krece od broja 2
		for (int i = 2; n > 1; i++) {
			// ako je broj djeljiv sa i
			if (n % i == 0) {
				// ubaci u listu
				list.add(i);
				// podijeli broj sa njegivim nadjenim faktorom
				n /= i;
				// brojac krece iz pocetka da trazi sledeci faktor
				// i ce biti 2 u sledecoj iteraciji
				i = 1;
			}
		}
		// Vraca listu sa faktorima.
		return list;
	}

	// Metod mnozi brojeve koje se pojavljuju neparni broj puta u listi.
	public static int oddFactors(ArrayList<Integer> list) {
		// Lista u kojoj se cuvaju brojevi.
		ArrayList<Integer> oddList = new ArrayList<>();
		int base = 1;
		for (int i = 0; i < list.size(); i++) {
			// brojac pri svakoj iteraciji postavljamo na jedan,
			// u suprotnom ako se broj pojavi jednom nece se moci
			// dodati u listu
			int brojac = 1;
			for (int j = 0; j < list.size(); j++) {
				// ne pregleda isti broj
				if (i != j) {
					// ako su brojevi jednaki
					if (list.get(j) == list.get(i)) {
						brojac++; // povecaj brojac pojavljivanja istih brojeva
					}
				}
			}
			// ako je pojavljivanje broja neparno i ako taj broj nije sadrzan
			// trenutno u listi dodajemo ga u listu
			if (brojac % 2 != 0 && !itContains(oddList, list.get(i))) {
				// dodaj ga u listu
				oddList.add(list.get(i));
			}
		}

		// Mnozi sve brojeve iz liste.
		for (Integer i : oddList) {
			base *= i;
		}
		// Vraca proizvod brojeva.
		return base;
	}

	// Metod provjerava da li je broj sadrzan u listi
	public static boolean itContains(ArrayList<Integer> list, int n) {
		// Petlja provjerava da li je broj jednak nekom broju u listi,
		for (Integer i : list) {
			if (n == i) {
				// ako jeste, vrati true
				return true;
			}
		}
		// Ako broj nije pronadjen u listi, vraca false.
		return false;
	}

}
