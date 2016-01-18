/*
 * Implementirati sledecu metodu da sortira redove 2D niza.
 * public static double[][] sortRows(double[][]array)
 * Napisati test program koji pita korisnika da unese 3x3 matricu,
 * ili da pita korisnika koliku matricu zeli unijeti,
 * te mu ispisuje na konzoli matricu sa sortiranim redovima,
 * od najmanjeg broja do najveceg.
 */
package zadaci_17_01_2016;
import java.util.Arrays;
import methods.Unos;
public class Zad5_SortiranNiz {

	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				// Sortira redove matrice.
				Arrays.sort(array[i]);
			}
		}
		// Vraca matricu sa sortiranim redovima.
		return array;
	}

	public static void main(String[] args) {
		
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite velicinu matrice:");
		int a = Unos.inputInt();
		double[][] matrica = new double[a][a];
		System.out.println("Unesite elemente matrice " + a + "x" + a);

		// Unosi elemente u 2D niz.
		for (int i = 0; i < matrica.length; i++) {
			for (int k = 0; k < matrica[i].length; k++) {
				matrica[i][k] = Unos.inputDouble();
			}
		}

		// Kreiramo matricu sa sortiranim redovima i printamo.
		double[][] matrix = sortRows(matrica);
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%4.2f ", matrix[row][column]);
			}
			System.out.println();
		}

	}

}
