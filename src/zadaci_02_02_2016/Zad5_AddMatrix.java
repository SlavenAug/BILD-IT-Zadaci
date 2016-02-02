/*
 *  (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum. 
 */
package zadaci_02_02_2016;

import methods.Unos;

public class Zad5_AddMatrix {

	public static void main(String[] args) {
		// Unosimo prvu matricu.
		System.out.println("Enter first matrix 3x3: ");
		double[][] firstMatrix = createMatrix();
		// Unosimo drugu matricu.
		System.out.println("Enter second matrix 3x3: ");
		double[][] secondMatrix = createMatrix();

		// Pozivamo metodu za sabiranje dve matrice i ispisujemo rezultat.
		System.out.println("Addition of two entered matrix is: ");
		printMultyArray(addMatrix(firstMatrix, secondMatrix));

	}

	// Metoda koja kreiranje matrice 3x3.
	public static double[][] createMatrix() {
		// Kreiramo matricu 3x3.
		double[][] matrix = new double[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// Unosimo elemente matrice.
				matrix[i][j] = Unos.inputDouble();
			}
		}
		return matrix;
	}

	// Metoda koja sabire dvije matrice.
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// Kreiramo matricu za cuvanje.
		double[][] c = new double[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				// Sabiremo elemente na istim pozicijama.
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		// Vraca sabranu matricu.
		return c;
	}

	// Metoda koja ispisuje 2D matricu.
	public static void printMultyArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
