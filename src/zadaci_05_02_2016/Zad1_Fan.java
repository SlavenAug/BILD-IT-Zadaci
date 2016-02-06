/* 
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
■ A string data field named color that specifies the color of the fan (the default
is blue).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.
■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.
 */
package zadaci_05_02_2016;

public class Zad1_Fan {

	public static void main(String[] args) {

		// Kreiramo objekte.
		Fan vent1 = new Fan(true, 3, 10, "Yellow");
		Fan vent2 = new Fan(false, 2, 5, "Blue");

		// Printamo rezultat.
		System.out.println(vent1);
		System.out.println(vent2);

	}

}

class Fan {

	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "Blue";

	// No-arg konstruktor.
	public Fan() {

	}

	// Konstruktor sa tijelom.
	public Fan(boolean on, int speed, double radius, String color) {
		this.on = on;
		this.speed = speed;
		this.radius = radius;
		this.color = color;
	}

	public void turnOnOff() {
		if (on) {
			on = false;
		} else {
			on = true;
		}
	}

	public int getSpeed() {
		if (on) {
			return speed;
		}
		return 0;
	}

	public void setSpeed(int speed) {
		if (on) {
			if (speed == 1) {
				this.speed = SLOW;
			} else if (speed == 2) {
				this.speed = MEDIUM;
			} else if (speed == 3) {
				this.speed = FAST;
			}
		} else {
			System.out.println("Fan is off!");
		}

	}

	// Metod vraca radijus.
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Radius must be larger than zero!");
		}
	}

	// Metod vraca boju.
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String s;

		if (on) {
			if (speed == 1) {
				s = "SLOW";
			} else if (speed == 2) {
				s = "MEDIUM";
			} else {
				s = "FAST";
			}

			return "Fan is on and working on speed: " + s + "\nRadius is: " + radius + "\ncolor is " + color;
		} else {
			return "Fan is not working, try to turnit on!!!";
		}
	}
}