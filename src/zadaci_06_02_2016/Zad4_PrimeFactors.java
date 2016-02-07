/*
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order. For
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * retrieve and display them in reverse order.
 */
package zadaci_06_02_2016;

import methods.Unos;

public class Zad4_PrimeFactors {

	public static void main(String[] args) {

		System.out.print("Enter an integer: ");
		int number = Unos.inputInt();

		factors(number);

	}

	// Pronalazi i printa najmanji faktor broja.
	public static void factors(int number) {
		Zad4_StackOfIntegers stack = new Zad4_StackOfIntegers();
		int i = 2;
		// Trazi faktore sve dok broj nije 1.
		while (number != 1) {
			if (number % i != 0) {
				i++;
			} else {
				number /= i;
				stack.push(i);
			}
		}

		System.out.println("Smallest factors are:");
		// Printamo faktore.
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
