/*
 * (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */
package zadaci_12_02_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad3_InputValidation {

	public static void main(String[] args) {
		// Kreiramo varijable.
		int num1 = input();
		int num2 = input();
		// Prikazujemo sumu unesenih brojeva.
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
	}

	// Metod za provjeru ulaza.
	public static int input() {
		Scanner input = new Scanner(System.in);
		int in = 0;
		// Postavljamo uslov petlje.
		boolean condition = true;
		while (condition) {
			try {
				System.out.print("Enter an int value: ");
				// Unosimo vrijednost.
				in = input.nextInt();
				// Ako je unesena vrijednost int,
				// postavljamo uslov petlje na false.
				condition = false;
			} catch (InputMismatchException e) {
				// Ako nije unesena vrijednost int
				// obavijesti korisnika da unese ponovo.
				System.out.println("You entered wrong value! Try again!");
				// Odbacujemo stari ulaz.
				input.next();
			}
		}
		// Vraca unesenu vrijednost.
		return in;
	}

}
