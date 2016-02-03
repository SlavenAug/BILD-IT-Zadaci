/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s.
 */
package zadaci_03_02_2016;

public class Zad5_EvenNumber {

	public static void main(String[] args) {
		// Generisemo matricu.
		int[][] matrix = generateMatrix();
		// Prikazujemo matricu.
		printArray(matrix);
		// Pozivamo metodu za prebrojavanje jedinica,
		// i prikazivanje rezultata.
		evenNumberOfOnes(matrix);
	}

	// Metoda generise matricu 6x6 sa nasumicnim vrijednostima 0 i 1.
	public static int[][] generateMatrix() {
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		return matrix;
	}

	// Metoda pronalazi jednak broj jedinica u redovima i kolonama.
	public static void evenNumberOfOnes(int[][] matrix) {
		// Varijable za cuvanje trenutnog rezultata u redovima i kolonama.
		int[] row = new int[6];
		int[] colum = new int[6];
		// Brojaci jedinica za redove i kolone.
		int countRow;
		int countColum;

		// Petlja kora prolazi kroz matricu.
		for (int i = 0; i < matrix.length; i++) {
			countRow = 0;
			countColum = 0;
			int j = 0;
			for (j = 0; j < matrix[i].length; j++) {
				// Broji jedinice u redovima.
				if (matrix[i][j] == 1) {
					countRow++;
				}
				// Broji jedinice u kolonama.
				if (matrix[j][i] == 1) {
					countColum++;
				}
			}
			// Cuvamo rezultat jedinica u redovima i kolonama.
			row[i] = countRow;
			colum[i] = countColum;
		}

		// Stampamo rezultat prebrojavanja.
		System.out.println();
		for (int i = 0; i < colum.length; i++) {
			for (int j = 0; j < colum.length; j++) {
				if (colum[i] == row[j]) {
					System.out.println("Colum at " + i + " and row at " + j + " has even number of 1s. " + colum[i]);
				}
			}
		}
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

}
