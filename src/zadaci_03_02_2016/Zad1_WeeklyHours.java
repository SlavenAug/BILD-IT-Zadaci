/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 * 
 *         Su M T W Th F Sa
 * Employee 0 2 4 3 4 5 8 8
 * Employee 1 7 3 4 3 3 4 4
 * Employee 2 3 3 4 3 3 2 2
 * Employee 3 9 3 4 7 3 4 1
 * Employee 4 3 5 4 3 6 3 8
 * Employee 5 3 4 4 6 3 4 4
 * Employee 6 3 7 4 8 3 8 4
 * Employee 7 6 3 5 9 2 7 9
 */
package zadaci_03_02_2016;

public class Zad1_WeeklyHours {

	public static void main(String[] args) {
		// Niz za cuvnje broja sati za odredjeni dan.
		int[][] array = new int[8][7];
		// Niz za cuvanje ukpnog broja sati.
		int[] employeeHours = new int[8];
		// Niz za cuvanje rednog broja radnika.
		int[] employeeIndex = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// Pozivamo metodu za nasumicno popunjavanje radnih sati.
		generateData(array);
		System.out.println("              M   T   W   Th  F   Sa  Su");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Employee " + (i + 1) + ":   ");
			printRow(i, array);
			// Ukupan broj sati za svakog od radnika.
			employeeHours[i] = sumRow(array[i]);
			System.out.println();
		}

		// Pozivamo metodu za sortiranje ukupnog broja sati.
		sort(employeeHours, employeeIndex);

		// Prikazujemo sortirani rezultat.
		System.out.println("Sorted per hours:");
		for (int i = 0; i < employeeHours.length; i++) {
			System.out.println("Employee " + employeeIndex[i] + " has working hours " + employeeHours[i]);
		}

	}

	// Metoda racuna ukupan broj sati radnika.
	public static int sumRow(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	// Metoda nasumicno popunjava radne sate.
	public static void generateData(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	// Metoda printa red u nizu.
	public static void printRow(int row, int[][] array) {
		for (int i = 0; i < array[row].length; i++) {
			System.out.printf("%-4d", array[row][i]);
		}
	}

	// Metoda za sortiranje broja radnih sati.
	public static void sort(int[] hours, int[] employee) {
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours.length; j++) {
				if (hours[i] > hours[j]) {
					// Sortira broj radnih sati.
					int temp = hours[i];
					hours[i] = hours[j];
					hours[j] = temp;
					// Sortira redni broj radnika.
					temp = employee[i];
					employee[i] = employee[j];
					employee[j] = temp;
				}
			}
		}
	}
}
