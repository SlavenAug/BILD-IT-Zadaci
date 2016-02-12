/*
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * the most 1s.)
 */
package zadaci_11_02_2016;

import java.util.ArrayList;

import methods.Unos;

public class Zad1_LargestRowColum {

	public static void main(String[] args) {

		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> colum = new ArrayList<>();

		System.out.print("Enter matrix length : ");
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		int n = Unos.inputInt();
		// Kreiramo nxn matricu.
		int[][] matrix = matrix(n);
		// Ispisujemo matricu.
		printMatrix(matrix);
		// Pozivamo metode za provjeru redova i kolona.
		checkRow(matrix, row);
		checkColum(matrix, colum);
		// Ispisujemo rezulata.
		System.out.println("The largest row index: " + row);
		System.out.println("The largest colum index: " + colum);

	}

	// Metoda vraca nxn matricu ispisanu sa 0 i 1.
	public static int[][] matrix(int n) {
		// Kreiramo nxn matricu.
		int matrix[][] = new int[n][n];
		// Ispisujemo matricu sa nulama i jedinicama.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		// Vraca kreiranu matricu.
		return matrix;
	}

	// Metoda ispisuje matricu.
	public static void printMatrix(int[][] mat) {
		for (int[] is : mat) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// Metoda trazi redove sa najvise jedinica.
	public static void checkRow(int[][] matrix, ArrayList<Integer> row) {
		// Postavljamo brojac jedinica u redovima.
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			// Postavljamo trenutni brojac jedinica u redu.
			int counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					// Uvecavamo trenutni brojac ako je pronadjena 1 u redu.
					counter++;
				}
			}
			// Ako je brojac jedinica manji od trenutnog brojaca,
			if (max < counter) {
				// onda je brojac jedinica jednak trenutnom brojacu jedinica.
				max = counter;
				// Brisemo stari rezultat.
				row.clear();
				// Postavljamo novi.
				row.add(i);
			} else if (max == counter) {
				// Ako postoji vise redova sa istim brojem jedinica, dodajemo u
				// novi index.
				row.add(i);
			}
		}

	}

	// Metoda trazi kolone sa najvise jedinica.
	public static void checkColum(int[][] matrix, ArrayList<Integer> colum) {
		// Postavljamo brojac jedinica u kolonama.
		int max = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			// Postavljamo trenutni brojac jedinica.
			int counter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1) {
					// Uvecavamo trenutni brojac.
					counter++;
				}
			}
			// Ako je brojac jedinica manji od trenutnog brojaca,
			if (max < counter) {
				// onda je brojac jedinica jednak trenutnom brojacu.
				max = counter;
				// Brisemo stari rezultat.
				colum.clear();
				// Upisujemo novi.
				colum.add(i);
			} else if (max == counter) {
				// Ako postoji vise kolona sa istim brojem jedinica, dodajemo u
				// novi index.
				colum.add(i);
			}
		}
	}

}
