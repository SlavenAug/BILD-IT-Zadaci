/*(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
- Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified side1, side2, and
side3.
- The accessor methods for all three data fields.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter of this triangle.
- A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.
 */
package zadaci_10_02_2016;

import methods.Unos;

public class Zad1_Test {

	public static void main(String[] args) {
		// Unosimo stranice trougla.
		System.out.println("Enter three sides of triangle:");
		double s1 = Unos.inputDouble();
		double s2 = Unos.inputDouble();
		double s3 = Unos.inputDouble();
		Zad1_Triangle t = new Zad1_Triangle(s1, s2, s3);

		// Unosimo boju.
		System.out.println("Enter color: ");
		String color = Unos.stringNext();
		t.setColor(color);
		// Postavljamo uslov petlje.
		boolean condition = true;
		while (condition) {
			System.out.println("If geometric object is filled enter yes, if not enter no");
			try {
				String filled = Unos.stringNext().toLowerCase();

				// Ako je korisnikov unos "yes" postavljamo vrijednost true.
				if (filled.equals("yes")) {
					t.setFilled(true);
					condition = false;
				}
				// Ako je korisnikov unos "no" postavljamo vrijednost na false.
				if (filled.equals("no")) {
					t.setFilled(false);
					condition = false;
				}
			} catch (IncompatibleClassChangeError e) {
				Unos.stringNextLine();
			}
		}

		System.out.println(t + "\nArea is: " + t.getArea() + "\nPermiter is: " + t.getPerimeter() + "\nColor is: "
				+ t.getColor() + "\nIs filled: " + t.isFilled());

	}
}
