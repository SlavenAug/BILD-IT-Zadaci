/*
 * (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * area = (2 + 4/22)* side * side Write a test program that creates an Octagon
 * object with side value 5 and displays its area and perimeter. Create a new object
 * using the clone method and compare the two objects using the compareTo
 * method
 */
package zadaci_19_02_2016;

public class Zad3_Octagon {

	public static void main(String[] args) {
		// Kreiramo objekat.
		Octagonal o1 = new Octagonal(5, "blue", true);
		// Kloniramo objekat.
		Octagonal o2 = o1.clone();

		// Ako su jednaki.
		if (o1.compareTo(o2) == 0) {
			System.out.println("Ocragonals are equal");
			// Ako je prvi veci.
		} else if (o1.compareTo(o2) > 0) {
			System.out.println("First is bigger!");
		} else {
			// Ako je drugi veci.
			System.out.println("Second is bigger!");
		}

		// Prikazujemo njihove vrijednosti i hash kod.
		System.out.println(o1 + "\nHash o1: " + o1.hashCode());
		System.out.println(o2 + "\nHash o2: " + o2.hashCode());
		// Primjecujemo da su hashovi razliciti, sto znaci da
		// su i objekti razliciti, tj. da varijable o1 i o2 ne
		// sadrze istu referencu na objekat.

		o1 = null;
		System.out.println(o2 + "\nHash o2: " + o2.hashCode());
	}
}

// Klasa nasledjuje GeometricObject klasu u kojoj je definisam compareTo metod.
class Octagonal extends GeometricObject implements Cloneable {
	// stranica osmougla, pretpostavlja se da su sve stranice iste duzine
	protected double side;

	// No-arg konstruktor.
	public Octagonal() {

	}

	// Konstruktor sa odredjenom duzinom.
	public Octagonal(double side) {
		this.side = side;
	}

	// Konstruktor sa side, color, filled parametrima.
	public Octagonal(double side, String color, boolean filled) {
		this(side);
		setColor(color);
		setFilled(filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Implementiran metod za povrsinu.
	@Override
	public double getArea() {
		return (2 + (4 / 22)) * side * side;
	}

	// Implementiran metod za obim.
	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	// Impementacija metoda clone.
	@Override
	public Octagonal clone() {
		// kreira se novi objekat
		Octagonal o = new Octagonal();
		// kopira se vrijednost stranice
		o.side = getSide();
		// kopira se vrijdnost boje
		o.color = getColor();
		// popjunjenosti
		o.filled = filled;
		// datum kreiranja
		o.dateCreated = getDateCreated();
		// vracamo novi klonirani objekat
		return o;
	}

	@Override
	public String toString() {
		return "\nPerimeter is: " + getPerimeter() + "\nArea is: " + getArea() + (filled ? "\nColor is: " + color : "");
	}

}
