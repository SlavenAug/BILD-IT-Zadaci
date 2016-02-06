/*
 *  (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
 * h ave the same length and all angles have the same degree (i.e., the polygon is
 * both equilateral and equiangular). Design a class named RegularPolygon that contains:
 * ■ A private int data field named n that defines the number of sides in the polygon
 * with default value 3.
 * ■ A private double data field named side that stores the length of the side with
 * default value 1.
 * ■ A private double data field named x that defines the x-coordinate of the polygon’s
 * center with default value 0.
 * ■ A private double data field named y that defines the y-coordinate of the polygon’s
 * center with default value 0.
 * ■ A no-arg constructor that creates a regular polygon with default values.
 * ■ A constructor that creates a regular polygon with the specified number of sides
 * and length of side, centered at (0, 0).
 * ■ A constructor that creates a regular polygon with the specified number of sides,
 * length of side, and x- and y-coordinates.
 * ■ The accessor and mutator methods for all data fields.
 * ■ The method getPerimeter() that returns the perimeter of the polygon.
 * ■ The method getArea() that returns the area of the polygon. 
 */
package zadaci_05_02_2016;

public class Zad2_RegularPolygon {
	
public static void main(String[] args) {
		// Kreiramo objekte.
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println(rp1);
		System.out.println(rp2);
		System.out.println(rp3);
	}
}

class RegularPolygon {
	private int n = 3; 
	private double side = 1; 
	private double x = 0; 
	private double y = 0; 

	// No-arg konstruktor.
	public RegularPolygon() {

	}


	// Konstruktor sa tijelom.
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}


	public RegularPolygon(int n, double side, double x, double y) {
		this(n, side);
		this.x = x;
		this.y = y;
	}

	// Getteri i setteri.
	public int getN() {
		return n;
	}

	public void setN(int n) {
		if (n < 0) {
			n *= -1;
		}
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Racuna obim.
	public double getPerimeter() {
		return n * side;
	}

	// Racuna povrsinu.
	public double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}
	
	public String toString() {
		return "\nnumber of sides: " + n +
				"\nlength of side: " + side +
				"\nx coordinate: " + x + 
				"\ny coordinate: " + y +
				"\nperimeter: " + getPerimeter() + 
				"\narea: " + getArea();	
	}

}
