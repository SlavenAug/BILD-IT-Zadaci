/*
 * Zadatak 3:  Napisati metode sa sljedeæim headerima:
 * public static int reverse(int number) i
 * public static boolean isPalindrome(int number).
 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako.
 * (npr. reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj
 * palindrom a false ukoliko nije. Koristite reverse metodu da implementirate
 * isPalindrome metodu. Napišite program koji pita korisnika da unese
 * broj te mu vrati da li je broj palindrome ili ne. 
 */
package zadaci_20_01_2016;

import methods.Unos;

public class Zad3_ReversePalindrom {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite cijeli broj:");
		int broj = Unos.inputInt();

		// Poziva metodu i ispisuje rezultat.
		System.out.println("Broj " + broj + (isPalindrome(broj) ? " jest" : " nije") + " palindrom");

	}

	// Metoda vraca broj sa obrnutim ciframa.
	public static int reverse(int number) {
		// Kreiramo varijablu.
		int reversed = 0;
		// Petlja vrti sve dok se reversed ne svede na 0.
		while (number != 0) {
			reversed = reversed * 10 + number % 10;
			number /= 10;
		}
		return reversed;
	}

	// Metoda provjerava da li je broj palindrom.
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
