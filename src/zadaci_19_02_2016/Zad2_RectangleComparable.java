/*
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal
 * if their areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable.
 */
package zadaci_19_02_2016;

public class Zad2_RectangleComparable {

	public static void main(String[] args) {
		// kreiramo dva objekta Rectangle
		Rectangle rec1 = new Rectangle(7, 4);
		Rectangle rec2 = new Rectangle(2, 4, "black", true);
		// Ako su jednaki.
		if (rec1.compareTo(rec2) == 0) {
			System.out.println("Rectangles are equals");
			// Ako je prvi veci od drugog.
		} else if (rec1.compareTo(rec2) > 0) {
			System.out.println("r1 is bigger than r2");
		} else {
			// Ako je drugi veci od prvog.
			System.out.println("r2 is bigger tha r1");
		}
		System.out.println(rec1);
		System.out.println(rec2);
	}
}

// Klasa Rectangle nasledjuje kalsu GeometricObject u kojoj se nalazi
// implementirani metod compareTo()
class Rectangle extends GeometricObject {
	protected double width;
	protected double height;

	// No-arg konstruktor.
	public Rectangle() {

	}

	// Konstruktor sa zadanom visinom i duzinom.
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Konstruktor sa zadanim vrijdenostima.
	public Rectangle(double width, double height, String color, boolean filled) {
		this(width, height);
		this.color = color;
		this.filled = filled;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Implementirani metod za povrsinu.
	@Override
	public double getArea() {
		return height * width;
	}

	// Implementirani metod za dobijanje obima pravougaonika.
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "\nPerimeter is: " + getPerimeter() + "\nArea is: " + getArea() + (filled ? "\nColor is: " + color : "");
	}
}
