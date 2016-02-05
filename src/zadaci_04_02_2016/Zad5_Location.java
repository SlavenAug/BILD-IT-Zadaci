/*
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as 
 * a double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * Enter the number of rows and columns in the array: 3 4
 * Enter the array:
 * 23.5 35 2 10
 * 4.5 3 45 3.5
 * 35 44 5.5 9.6
 * The location of the largest element is 45 at (1, 2)
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array.
 */
package zadaci_04_02_2016;

public class Zad5_Location {

	public static void main(String[] args) {
		// Kreiramo 2D niz.
		double[][] array = { { 3.0, 4.0, 5.6 }, { 45.4, 55, 2, 3.4 }, { 8.8, 101, 2, 78, 01 } };
		// Pozivamo metodu za pronalazenje najveceg elementa u nizu.
		System.out.println(locateLargest(array));
	}

	// Metoda pronalazi najveci element u nizu.
	public static Location locateLargest(double[][] a) {
		Location largest = new Location();
		// Uzimamo prvi elemenat u nizu i postavljamo kao max vrijednost.
		largest.setMaxValue(a[0][0]);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// Ako je trenutna vrijednost veca od max.
				if (a[i][j] > largest.getMaxValue()) {
					// Setuje novu max vrijednost.
					largest.setMaxValue(a[i][j]);
					// Setuje red niza.
					largest.setRow(i);
					// Setuje kolonu niza.
					largest.setColum(j);
				}
			}
		}
		// Vracamo objekat koji sadrzi najvecu lokaciju elementa.
		return largest;
	}

}

class Location {
	public int colum;
	public int row;
	public double maxValue;

	// No-arg konstruktor
	public Location() {

	}

	public Location(int colum, int row, double maxValue) {
		this.colum = colum;
		this.row = row;
		this.maxValue = maxValue;
	}

	// Getters and Setters
	public int getColum() {
		return colum;
	}

	public void setColum(int colum) {
		this.colum = colum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	@Override
	public String toString() {
		return "The location of the largest element is " + maxValue + " at (" + row + ", " + colum + ")";
	}

}
