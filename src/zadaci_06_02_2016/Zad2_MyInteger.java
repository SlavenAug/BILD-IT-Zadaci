/*
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * ■ An int data field named value that stores the int value represented by this bject.
 * ■ A constructor that creates a MyInteger object for the specified int value.
 * ■ A getter method that returns the int value.
 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * ■ The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * ■ A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * ■ A static method parseInt(String) that converts a string into an int
 * value.
 */
package zadaci_06_02_2016;

public class Zad2_MyInteger {

	public static void main(String[] args) {

		MyInteger num = new MyInteger(13);

		System.out.println(num.isOdd());
		System.out.println(num.isEven());
		System.out.println(num.isPrime());
		System.out.println(MyInteger.isPrime(num));
		System.out.println(MyInteger.isOdd(num));
		System.out.println(MyInteger.parseInt("34s"));
		System.out.println(num.equals(13));
	}
}

class MyInteger {
	private int value;

	// Konstruktor koji pravi objekat integer sa definisanom vrijednocu.
	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	// Metod provjerava da li je broj paran.
	public boolean isEven() {
		return value % 2 == 0;
	}

	// Metod provjerava da li je broj paran.
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isEven(MyInteger integer) {
		return isEven(integer.value);
	}

	// Provjerava da li je broj neparan.
	public boolean isOdd() {
		return value % 2 != 0;
	}

	// Provjerava da li je broj neparan.
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isOdd(MyInteger integer) {
		return isOdd(integer.value);
	}

	// Metoda provjerava da li je broj prost.
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Metoda provjerava da li je broj prost.
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(MyInteger integer) {
		return isPrime(integer.value);
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger integer) {
		return equals(integer.value);
	}

	public static int[] parseInt(char[] charArr) {
		int num[] = new int[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= '0' && charArr[i] <= '9') {
				num[i] += charArr[i] - '0';
			}
		}

		return num;
	}

	public static int parseInt(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			char cr = str.charAt(i);
			if (cr >= '0' && cr <= '9') {
				num = (num * 10) + cr - '0';
			}
		}
		return num;
	}
}
