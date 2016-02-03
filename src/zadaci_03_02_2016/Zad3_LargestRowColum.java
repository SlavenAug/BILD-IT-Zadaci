/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2
 */
package zadaci_03_02_2016;

public class Zad3_LargestRowColum {

	public static void main(String[] args) {
		// Pozivamo metodu za generisanje matrice.
		int[][] matrix = generateMatrix();
		// Pozivamo metodu za printanje matrice.
		printMatrix(matrix);
		// Pozivamo metodu za pronalazenje najvise
		// jedinica u redu i koloni.
		getRowColum(matrix);
	}

	// Metoda za generisanje 4x4 matrice.
	public static int[][] generateMatrix() {
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;
	}

	// Metoda za pronalazenje najvise jedinica u redu i koloni.
	public static void getRowColum(int[][] matrix) {
		// Varijable za cuvanje brojeva jedinica.
		int greatestRow = 0;
		int greatestColum = 0;
		// Varijable za cuvanje indexa kolone i reda.
		int indexColum = 0;
		int indexRow = 0;
		// Brojaci jedinica.
		int countRow;
		int countColum;

		// Petlja koja prolazi kroz matricu i pronalazi pozicije
		// kolona i redova u kojima ima najvise jedinica.
		for (int i = 0; i < matrix.length; i++) {
			// Resetujemo brojace za kolone i redove.
			countRow = 0;
			countColum = 0;

			for (int j = 0; j < matrix.length; j++) {
				// Uvecavamo brojac jedinica za redove.
				if (matrix[i][j] == 1) {
					countRow++;
				}
				// Uvecavamo brojac jedinica za kolone.
				if (matrix[j][i] == 1) {
					countColum++;
				}
			}
			// Provjerava da li u trenutnom redu ima najvise jedinica.
			if (countRow >= greatestRow) {
				greatestRow = countRow;
				// Cuvamo index reda u kojem ima najvise jedinica.
				indexRow = i;
			}
			// Provjerava da li u trenujtnoj koloni ima najvise jedinica.
			if (countColum >= greatestColum) {
				greatestColum = countColum;
				// Cuvamo index kolone u kojoj ima najvise jedinica.
				indexColum = i;
			}
		}
		// Stampamo rezultat.
		System.out.println("The largest row index:" + indexRow);
		System.out.println("The largest colum index:" + indexColum);
	}

	// Metoda za stampanje matrice.
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
