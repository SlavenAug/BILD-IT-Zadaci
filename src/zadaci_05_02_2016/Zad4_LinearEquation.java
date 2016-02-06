/*
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations. The class contains:
 * ■ Private data fields a, b, c, d, e, and f.
 * ■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■ Six getter methods for a, b, c, d, e, and f.
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■ Methods getX() and getY() that return the solution for the equation.
 */
package zadaci_05_02_2016;

import methods.Unos;

public class Zad4_LinearEquation {

	public static void main(String[] args) {
		System.out.println("Unesite vrijednost a:");
		double a = Unos.inputDouble();
		System.out.println("Unesite vrijednost b:");
		double b = Unos.inputDouble();
		System.out.println("Unesite vrijednost c:");
		double c = Unos.inputDouble();
		System.out.println("Unesite vrijednost d:");
		double d = Unos.inputDouble();
		System.out.println("Unesite vrijednost e:");
		double e = Unos.inputDouble();
		System.out.println("Unesite vrijednost f:");
		double f = Unos.inputDouble();

		// Kreiramo objekat.
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

		// Prikazujemo rezultat.
		System.out.println(linearEquation);

	}

}

class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// Konstruktor.
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return (a * d - b * c) != 0;
	}

	// Racuna X.
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	// Racuna Y.
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}

	@Override
	public String toString() {
		// Provjera da li jednacina ima rjesenje.
		if (isSolvable()) {
			// Ako ima prikazi x i y.
			return "\nSolution is:\nx = " + getX() + "\ny = " + getY();
		} else {
			// U suprotnom ispisuje poruku.
			return "\nEquation has no solution!";
		}
	}

}
