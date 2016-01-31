/*
 * Napisati program koji pita korisnika da unese
 * cijeli trocifreni broj te provjerava da li je unijeti broj
 * palindrom. Broj je palindrom ukoliko se čita isto i sa
 * lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */
package zadaci_30_01_2016;

import methods.Unos;

public class Zad1_Palindrome {

	public static void main(String[] args) {
		System.out.println("Unesite cijeli trocifreni broj: ");
		// Kreiramo varijablu.
		int broj = 0;
		// Postavljamo uslov petlje.
		boolean prekid = true;

		while (prekid) {
			broj = Unos.inputInt();
			// Ako je broj trocifren izlazi iz petlje.
			if (broj > 99 && broj < 1000) {
				prekid = false;
				break;
			} else {
				// Ispisuje gresku u slucaju da nije unijet trocifren broj.
				System.out.println("Niste unijeli trocifreni broj! Pokusajte ponovo.");
			}
		}
		// Pozivamo metodu za provjeru da li je unijeti broj palindrom.
		palindrome(broj);
	}

	public static void palindrome(int number) {
		// Kreiramo varijable.
		int num = 0;
		int number1 = number;
		// Petlja vrti sve dok broj nije 0.
		while (number1 != 0) {
			// Uzimamo zadnju cifru broja.
			num = num * 10 + number1 % 10;
			// Uklanjamo zadnju cifru broja.
			number1 /= 10;
		}
		if (num == number) {
			// Ako je broj palindrom.
			System.out.println("Broj " + number + " jest palindrom.");
		} else {
			// Ako broj nije palindrom.
			System.out.println("Broj " + number + " nije palindrom.");
		}
	}

}
