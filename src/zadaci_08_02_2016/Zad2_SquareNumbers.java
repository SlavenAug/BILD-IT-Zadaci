/*
 * (Square numbers) Find the first ten square numbers that are greater than
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your
 * program fast.
 */
package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zad2_SquareNumbers {

	public static void main(String[] args) {
		// Korjenujemo broj Long.MAX_VALUE i dodajemo njegovu vrijednost
		// BigInteger n
		// svaki sledeci broj pomnozen sam sa sobom je kvadratni broj
		// veci od Long.MAX_VALUE.
		BigInteger num = new BigInteger((long) Math.ceil(Math.sqrt(Long.MAX_VALUE)) + "");

		for (int i = 0; i < 10; i++) {
			// Prikazujemo broj.
			System.out.println(num.multiply(num));
			// Uvecavamo ga za jaedan.
			num = num.add(BigInteger.ONE);
		}
	}

}
