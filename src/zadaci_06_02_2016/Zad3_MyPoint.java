/*
 * (The MyPoint class) Design a class named MyPoint to represent a point with
 * x- and y-coordinates. The class contains:
 * ■ The data fields x and y that represent the coordinates with getter
 * methods.
 * ■ A no-arg constructor that creates a point (0, 0).
 * ■ A constructor that constructs a point with specified coordinates.
 * ■ A method named distance that returns the distance from this point to a
 * specified point of the MyPoint type.
 * ■ A method named distance that returns the distance from this point to
 * another point with specified x- and y-coordinates.
 */
package zadaci_06_02_2016;

public class Zad3_MyPoint {

	public static void main(String[] args) {

		MyPoint point1 = new MyPoint(0, 0);
		MyPoint point2 = new MyPoint(10, 30.5);
		

		System.out.println(point1.distance(point2));
		
	}

}

class MyPoint {
	// Polje podataka. Varijable za cuvanje vrijednosti koordinata.
	private double x;
	private double y;

	// No-arg konstruktor.
	public MyPoint() {

	}


	 // Konstruktor kreira objekat sa zadanim vrijednostima.
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	 // Meotod za izracunavanje udaljenosti tacaka. 
	public double distance(MyPoint point) {
		return distance(point.x, point.y);
	}


	 // Meotod za izracunavanje udaljenosti dvije tacke.
	public double distance(double x, double y) {
		return Math.pow(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2), 0.5);
	}
}