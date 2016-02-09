/*
 *  Large prime numbers) Write a program that finds five prime numbers larger
 * than Long.MAX_VALUE.
 */
package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zad3_LargePrimeNumbers {

	public static void main(String[] args) {
		// BigInteger koji sadrzi maksimalnu vrijednost broja Long.
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");

		// Postavljamo brojac.
		int counter = 0;
		while (counter < 5) {
			// Ako je broj prost.
			if (number.isProbablePrime(1)) {
				// Prikazujemo ga.
				System.out.println(number);
				// Uvecavamo brojac.
				counter++;
			}
			// Uvecavamo broj koji se provjerava.
			number = number.add(BigInteger.ONE);
		}
	}

}
