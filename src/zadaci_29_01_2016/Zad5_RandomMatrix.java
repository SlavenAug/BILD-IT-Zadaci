/*
 * Napisati metodu koja ispisuje n x n matricu koristeći
 * se sljedećim headerom: public static void printMatrix(int n).
 * Svaki element u matrici je ili 0 ili 1, nasumično generisana.
 * Napisati test program koji pita korisnika da unese broj n
 * te mu ispiše n x n matricu u konzoli.
 */
package zadaci_29_01_2016;

import methods.Unos;

public class Zad5_RandomMatrix {

	public static void main(String[] args) {

		System.out.println("Enter a size of matrix: ");
		printMatrix(generateMatrix(Unos.inputInt()));

	}

	// Metoda za generisanje n x n matrice vrijednosti 0 i 1.
	public static int[][] generateMatrix(int n) {
		// Matrica n x n.
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// Upis nasumicnih vrijednosti 0 i 1.
				matrix[i][j] = (int) (Math.random() * 2);

			}
		}
		// Vracamo generisanu matricu.
		return matrix;
	}

	// Metoda za printanje matrice.
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				// Printamo trenutni element.
				System.out.print(matrix[i][k] + " ");
			}
			// Prelazimo u novi red.
			System.out.println();
		}
	}

}
