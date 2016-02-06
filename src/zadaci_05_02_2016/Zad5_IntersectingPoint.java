/*
 * (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
 * for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point.
 */

package zadaci_05_02_2016;

import methods.Unos;

public class Zad5_IntersectingPoint {
	public static void main(String[] args) {
		System.out.println("Unesite x1:");
		double x1 = Unos.inputDouble();

		System.out.println("Unesite y1:");
		double y1 = Unos.inputDouble();

		System.out.println("Unesite x2:");
		double x2 = Unos.inputDouble();

		System.out.println("Unesite y2:");
		double y2 = Unos.inputDouble();

		System.out.println("Unesite x3:");
		double x3 = Unos.inputDouble();

		System.out.println("Unesite y3:");
		double y3 = Unos.inputDouble();

		System.out.println("Unesite x4:");
		double x4 = Unos.inputDouble();

		System.out.println("Unesite y4:");
		double y4 = Unos.inputDouble();

		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (a * x1) - (b * y1);
		double f = (c * x3) - (d * y3);

		// Kreiranje objekta LinearEquation.
		LinearEquation ip = new LinearEquation(a, b, c, d, e, f);

		if (ip.isSolvable()) {
			// Ako je jednacina rijesiva, prikazuje
			// koordinate presijecanja.
			System.out.println(ip);
		} else {
			// Ako nije prikazuje da su linije paralelne.
			System.out.println("Two lines are paralel!");
		}
	}
}
