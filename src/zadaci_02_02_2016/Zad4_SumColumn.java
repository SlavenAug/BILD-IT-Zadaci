/*
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column. Here is a sample run:
 * Enter a 3-by-4 matrix row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * Sum of the elements at column 0 is 16.5
 * Sum of the elements at column 1 is 9.0
 * Sum of the elements at column 2 is 13.0
 * Sum of the elements at column 3 is 13.0
 */
package zadaci_02_02_2016;

import methods.Unos;

public class Zad4_SumColumn {

	public static void main(String[] args) {
		// Pozivamo metode.
		sumColum(createMatrix());
	}

	// Metoda za kreiranje matrice.
	public static double[][] createMatrix() {
		// Kreiramo matricu dimenzije 3x4.
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// Unosimo elemente matrice.
				matrix[i][j] = Unos.inputDouble();
			}
		}
		// Vraca matricu.
		return matrix;
	}

	public static void sumColum(double[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			// Varijabla za cuvanje sume.
			double sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				// Sabiremo vrijednosti u kolonama.
				sum += matrix[j][i];
			}
			/*
			 * Kada se izadje iz unutrasnje petlje, prikaze se rezultat
			 * sumiranja kolone, resetujemo sumu, i krecemo sabiranje sume
			 * sledece kolone.
			 */
			System.out.println("Sum of the elements at colum " + i + " is " + sum);

		}
	}
}
