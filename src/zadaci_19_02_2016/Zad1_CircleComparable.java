/*
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their radii
 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
 * and Comparable.
 */
package zadaci_19_02_2016;

public class Zad1_CircleComparable {

	public static void main(String[] args) {
		// Kreiramo dva objekta.
		Circle circle1 = new Circle(5, "morbid", true);
		Circle circle2 = new Circle(3);
		// Ako su jednaki.
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("Circles are equal!");
			// Ako je prvi veci od drugog.
		} else if (circle1.compareTo(circle2) > 0) {
			System.out.println("Circle c1 is larger than c2");
		} else {
			// Ako je drugi veci od prvog.
			System.out.println("Circle c2 is larger than c1");
		}

		System.out.println(circle1);
		System.out.println(circle2);
	}
}

// Klasa Circle nasledjuje klasu GeometricObject.
class Circle extends GeometricObject {
	// Poluprecnik kruga.
	protected double radius;

	// Konstruktor sa objek sa poluprecnikom duzine 1.
	public Circle() {
		this(1);
	}

	// Konstruktor kreira objekat sa zadanim poluprecnikom.
	public Circle(double radius) {
		this.radius = radius;
	}

	// Konstruktor kreira objekat sa zadanim poluprecnikom, bojom i filled.
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Precnik kruga.
	public double getDiameter() {
		return 2 * radius;
	}

	// Implementrirani metod koji vraca povrsinu kruga.
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Implementirani metod koji vraca obim kruga.
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "The circle is created " + getDateCreated() + " and the radius is " + radius;
	}
}
