/*
 * Find the first ten numbers with 50 decimal digits that are
 * divisible by 2 or 3.
 */
package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zad1_Divisable {

	public static void main(String[] args) {
		// Broj od kojeg pocinje pretraga djeljivih brojeva sa 2 ili 3.
		BigInteger number = new BigInteger("100000000000000000000000000000000000000000000000000");
		// Kreiramo objekat BigInteger vrijednosti 0.
		BigInteger zero = BigInteger.ZERO;
		// Objekat vrijednosti jedan.
		BigInteger one = BigInteger.ONE;
		// Vrijednost dva.
		BigInteger two = one.add(one);
		// Vrijednost 3.
		BigInteger three = two.add(one);
		// Petlja u kojoj se traze djeljivi brojeva sa dva i tri.
		for (int i = 0; i < 10;) {
			// Ako je broj djeljiv sa 2 ili 3.
			if (number.remainder(two).equals(zero) || number.remainder(three).equals(zero)) {
				// Prikazuje ga.
				System.out.println(number);
				i++; // Uvecavamo brojac.
			}
			// Uvecavamo trenutni provjereni broj.
			number = number.add(one);
		}
	}

}
