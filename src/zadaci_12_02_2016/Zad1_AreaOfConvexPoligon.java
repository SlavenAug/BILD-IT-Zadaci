/*
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 */
package zadaci_12_02_2016;

import methods.Unos;

public class Zad1_AreaOfConvexPoligon {

	public static void main(String[] args) {
		// Unos duzine niza, tj. broj tacaka
		System.out.println("Enter a number of points: ");
		double[][] points = new double[Unos.inputInt()][2];
		// Unos tacaka poligona
		System.out.println("Enter the points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = Unos.inputDouble();
			}
		}
		// Poziv metoda za izracunavanje povrsine i prikaz rezultata.
		System.out.println("The total area is: " + area(points));
	}

	// Metod izracunava povrsinu mnogougla.
	public static double area(double[][] points) {
		// Povrsina poligona.
		double area = 0;
		// Prvo racunamo za Xn*Y1 - X1*Yn
		area += points[points.length - 1][0] * points[0][1] - points[0][0] * points[points.length - 1][1];
		// Petlja racuna za svako Xi*Yi+1 - Xi-1*Yi
		for (int i = 0; i < points.length - 1; i++) {
			area += points[i][0] * points[i + 1][1] - points[i][1] * points[i + 1][0];
		}
		return Math.abs(area) / 2.0;
	}
}
