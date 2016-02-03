/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication.
 */
package zadaci_03_02_2016;

public class Zad2_MultiplyMatrix {

	public static void main(String[] args) {
		// Kreiramo matrice.
		double[][] a = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };
		double[][] b = { { 0.0, 2.0, 4.0 }, { 1.0, 4.5, 2.2 }, { 1.1, 4.3, 5.2 } };
		// Pozivamo metode za mnozenje i prikazivanje matrice.
		printMatrix(multiplyMatrix(a, b));

	}

	// Metoda za mnozenje dvije matrice.
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		// Kreiramo novu matricu za cuvanje.
		double[][] c = new double[3][3];
		// Petlja za mnozenje matrica.
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < c.length; k++) {
					// Formula za mnozenje.
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		// Vracamo pomnozenu matricu.
		return c;
	}

	// Metoda za prikaz matrice.
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6.1f ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
