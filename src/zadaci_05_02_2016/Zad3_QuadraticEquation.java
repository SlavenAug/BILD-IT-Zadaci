/*
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + x = 0. The class contains:
 * ■ Private data fields a, b, and c that represent three coefficients.
 * ■ A constructor for the arguments for a, b, and c.
 * ■ Three getter methods for a, b, and c.
 * ■ A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac.
 * ■ The methods named getRoot1() and getRoot2() for returning two roots of the equation.
 */
package zadaci_05_02_2016;

import methods.Unos;

public class Zad3_QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Please enter three coefficients:");
		double a = Unos.inputDouble();
		double b = Unos.inputDouble();
		double c = Unos.inputDouble();
		
		// Kreiramo objekat.
		QuadraticEquation qe = new QuadraticEquation(a, b, c);
		// Ispisujemo rezultat.
		System.out.println(qe );
		

	}

}

class QuadraticEquation {
	private double a, b, c;

	// Konstruktor.
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	// Racuna diskriminantu.
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	// Racuna prvi korijen.
	public double getRoot1() {
		return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
	}

	// Racuna drugi korijen.
	public double getRoot2() {
		return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
	}

	@Override
	public String toString() {
		// Ako je diskriminanta pozitivna, prikazuje oba korijena.
		if (getDiscriminant() > 0) {
			return "root one is: " + getRoot1() + "\nroot two is: "
					+ getRoot2();
			// Ako je diskriminanta 0 prikazu je se prvi korijen.
		} else if (getDiscriminant() == 0) {
			return "Equation has only one root: " + getRoot1();
			// ako je negativna, onda jednacina nema rijesenja.
		} else {
			return "The equation has no real roots!";
		}
	}
	
	
}
