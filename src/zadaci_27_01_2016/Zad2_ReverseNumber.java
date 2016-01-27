/*
 * Napišite metodu sa sljedećim headerom koja vraća naopako
 * ispisan broj koji joj je proslijeđen kao argument:
 * public static void reverse(int number). Na primjer, reverse(3456)
 * treba da vrati 6543. Napisati program koji pita korisnika da unese
 * neki cijeli broj te mu vrati isti ispisan naopako. 
 */
package zadaci_27_01_2016;

import methods.Unos;

public class Zad2_ReverseNumber {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite cijeli broj:");
		int num = Unos.inputInt();
		
		// Pozivamo metodu za ispis reverse broja.
		System.out.println("Broj naopako: " + reverse(num));
	}

	public static int reverse(int number) {
		// Kreiramo varijabli za cuvanje obrnutih cifri.
		int reverseNum = 0;
		// Petlja koja vrti sve dok se broj ne svede na nulu.
		while (number != 0) {
			// Dodajemo po jednu cifru.
			reverseNum = reverseNum * 10 + number % 10;
			// Odbacujemo dodatu cifru.
			number /= 10;
		}
		// Vraca rezultat.
		return reverseNum;
	}

}
