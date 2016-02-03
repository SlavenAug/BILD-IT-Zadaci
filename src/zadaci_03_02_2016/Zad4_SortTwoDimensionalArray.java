/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header:
 * public static void sort(int m[][])
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * will be sorted to
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
package zadaci_03_02_2016;

public class Zad4_SortTwoDimensionalArray {

	public static void main(String[] args) {

		int[][] m = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		// Pozivamo metodu za sortiranje dvodimenzionalnog niza.
		sort(m);
		// Pozivamo metodu za printanje dvodimenzionalnog niza.
		printArray(m);
	}

	// Metoda za printanje dvodimenzionalnog niza.
	public static void printArray(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * Metoda za sortiranje dvodimenzionalnog niza. Prvo se sortiraju podnizovi,
	 * a onda vrijednosti u podnizovima.
	 */
	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				// Provjeravamo da li je u provjeravanim podnizovima vrijednosti
				// prvih elemenata veca, ako jest, zamijeni mijesta podnizovima.
				if (m[j][0] > m[i][0]) {
					int temp[] = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				// Provjeravamo da li su prvi elementi u podnizovima jednaki.
				if (m[i][0] == m[j][0]) {
					// Ako jesu provjeri da li su drugi elementi veci jedan od
					// drugog, ako jest, zmijeni im pozicije.
					if (m[j][1] > m[i][1]) {
						int temp = m[i][1];
						m[i][1] = m[j][1];
						m[j][1] = temp;
					}
				}
			}
		}
	}
}
