/*
 *  (Sum the areas of geometric objects) Write a method that sums the areas of all the
 * geometric objects in an array. The method signature is:
 * public static double sumArea(GeometricObject[] a) 
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 */
package zadaci_19_02_2016;

public class Zad4_SumOfArea {

	public static void main(String[] args) {
		// Kreiramo niz od 5 objekta razlicitih klasa (Circle, Rectangle,
		// Octagonal)
		GeometricObject[] o = { new Circle(2, "black", true), new Circle(6), new Rectangle(8, 5),
				new Rectangle(2, 6, "yellow", false), new Octagonal(9) };
		// Prikazujemo sumu povrsina objekata.
		System.out.println("Sum of area from all objects in array is: " + sumArea(o));
	}

	// Metod za racunanje ukupne povrsine svih objekata koji se nalaze u nizu.
	public static double sumArea(GeometricObject[] a) {
		// Kreiramo sumu.
		double sumOfArea = 0;
		for (int i = 0; i < a.length; i++) {
			// Dodajemo sumu povrsina svih objekata iz niza.
			sumOfArea += a[i].getArea();
		}
		// Vracamo povrsinu objekata.
		return (int) (sumOfArea * 100) / 100.0;
	}
}
