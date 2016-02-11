package zadaci_10_02_2016;

public class Zad1_Triangle extends Zad1_GeometricObject {

	// Kreiramo stranice trougla.
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// No-arg konstruktor.
	public Zad1_Triangle() {

	}

	// Konstruktor kreira objekat sa stranicama trougla.
	public Zad1_Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Konstruktor kreira objekat sa odredjenim parametrima.
	// Pozivamo konstruktor iz super klase.
	public Zad1_Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Metod vraca povrsinu.
	public double getArea() {
		double a = (side1 + side2 + side3) / 2;
		return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
	}

	// Metod vraca obim.
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
