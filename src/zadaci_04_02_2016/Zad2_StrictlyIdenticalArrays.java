/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical.
 */
package zadaci_04_02_2016;

public class Zad2_StrictlyIdenticalArrays {

	public static void main(String[] args) {

		int[][] matrix1 = { { 51, 22, 25 }, { 6, 1, 4 }, { 24, 54, 6 } };
		int[][] matrix2 = { { 51, 22, 25 }, { 6, 1, 4 }, { 24, 54, 6 } };
		// Provjeravamo da li su dva niza striktno identicna.
		System.out.println("The two arrays are " + (equals(matrix1, matrix2) ? "" : "not") + " strictly identical");
	}

	// Metoda provjerava da li su dva niza striktno identicna.
	public static boolean equals(int[][] m1, int[][] m2) {

		for (int i = 0; i < m1.length; i++) {
			// Provjera dali su duzine podnizova iste.
			if (m1[i].length != m2[i].length) {
				// Ako nisu vracamo false.
				return false;
			}
			for (int j = 0; j < m1[i].length; j++) {
				// Provjeravamo da li je svaki element u nizu jednak.
				if (m1[i][j] != m2[i][j]) {
					// Ako nije vracamo false.
					return false;
				}
			}
		}
		// Niz je striktno identican.
		return true;
	}

}
