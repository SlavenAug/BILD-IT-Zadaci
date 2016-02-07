/*
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * reverse order.
 */
package zadaci_06_02_2016;

import methods.Unos;

public class Zad5_PrimeNumbers {

	public static void main(String[] args) {
		Zad4_StackOfIntegers stack = new Zad4_StackOfIntegers();
		// Ubacujemo proste brojeve u stack.
		for (int i = 0; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}

		System.out.println("Prime numbers are:");
		// Stampamo proste brojeve iz staka.
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// Metod provjerava da li je broj prost.
	static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime && number != 0 && number != 1) {
			return true;
		} else {
			return false;
		}

	}
}
