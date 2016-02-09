/*
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2p - 1 for some positive integer p. Write a program that finds
 * all Mersenne primes with p … 100 and displays the output
 */
package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zad4_MersennePrime {

	public static void main(String[] args) {

		BigInteger one = BigInteger.ONE;
		BigInteger two = one.add(one);

		BigInteger mersennePrime; // trenutni provjeravani
		BigInteger number = two; // krecemo od broja dva sa provjerom

		System.out.println("prime\t\tmersenne prime");
		// Uslov petlje.
		int condition = 0;
		while (condition < 100) {
			// Svaki put se racuna broj po formuli: 2^p - 1.
			mersennePrime = two.pow(number.intValue()).subtract(one);
			// Ako je broj Prime i Mersenne Prime.
			if (number.isProbablePrime(1) && mersennePrime.isProbablePrime(1)) {
				// Prikazujemo brojeve.
				System.out.println(number + "\t\t" + mersennePrime);
				// Uvecavamo uslov petlje.
				condition++;
			}
			// Uvecavamo broj koji se povecava.
			number = number.add(one);
		}
	}

}
