/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE
 * that are divisible by 5 or 6.
 */
package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zad5_Divisible {

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		// Kreiramo objekat BigInteger vrijednosti 0.
		System.out.println(number);
		BigInteger zero = BigInteger.ZERO;
		// Kreiramo objekat vrijednosti jedan.
		BigInteger one = BigInteger.ONE;
		BigInteger five = new BigInteger("5");
		BigInteger six = new BigInteger("6");
		// Petlja koja pronalazi brojeve djeljive sa 5 ili 6.
		for (int i = 0; i < 10;) {
			// Ako je broj djeljiv sa 5 ili 6.
			if (number.remainder(five).equals(zero) || number.remainder(six).equals(zero)) {
				// Prikazuje ga.
				System.out.println(number);
				// Uvecavamo brojac.
				i++;
			}
			// Uvecavamo trenutni provjereni broj.
			number = number.add(one);
		}
	}

}
