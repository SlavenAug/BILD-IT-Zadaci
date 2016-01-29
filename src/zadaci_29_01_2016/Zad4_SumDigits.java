/*
 * Napisati metodu koja izračunava zbir svih brojeva u
 * cijelom broju. Koristite sljedeći header:
 * public static int sumDigits(long n). Na primjer, ako pozovemo
 * metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda
 * treba da vrati 9. (2 + 3 + 4 = 9)
 */
package zadaci_29_01_2016;

import methods.Unos;

public class Zad4_SumDigits {
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Enter number: ");
		int number = Unos.inputInt();
		// Pozivamo metodu i ispisujemo rezultat.
		System.out.println("Sum of digits: " + sumDigits(number));
	}
	
	// Metoda koja racuna zbir svih cifara broja.
	public static int sumDigits(long n){
		// Varijabla za cuvanje rezultata.
		int sum = 0;
		// Petlja vrti sve dok ne svedemo broj na 0.
		while (n != 0){
			// Uzimamo zadnju cifru broja i sabiremo sa sumom.
			sum += n % 10;
			// Odbacujemo zadnju cifru.
			n = n / 10;
		}
		// Vracamo rezultat.
		return sum;
	}

}
