/*
 * (Row sorting) Implement the following method to sort the rows in a two dimensional
 * array. A new array is returned and the original array is intact.
 * public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix.
 */
package zadaci_04_02_2016;

public class Zad1_RowSorting {

	public static void main(String[] args) {
		// Inicijalizujemo 2D niz.
		double[][] m = { { 0.15, 0.875, 0.375 }, { 0.55, 0.005, 0.225 }, { 0.30, 0.12, 0.4 } };
		// Pozivamo metodu za printanje i sortiranje niza.
		printMatrix(sortRows(m));

	}

	// Metod za kopiranje niza.
	public static double[][] copyMultyArray(double[][] array) {
		double[][] newArray = new double[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// Kopiramo elemente niza.
				newArray[i][j] = array[i][j];
			}
		}
		// Vraca novi niz.
		return newArray;
	}

	// Metoda za sortiranje redova 2D niza.
	public static double[][] sortRows(double[][] m) {
		// Pozivamo metodu za kopiranje niza.
		double[][] matrix = copyMultyArray(m);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i].length; k++) {
					// Sortiramo redove.
					if (matrix[i][j] < matrix[i][k]) {
						double temp = matrix[i][j];
						matrix[i][j] = matrix[i][k];
						matrix[i][k] = temp;
					}
				}
			}
		}
		return matrix;
	}

	// Metoda za prikaz matrice.
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6.3f ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
