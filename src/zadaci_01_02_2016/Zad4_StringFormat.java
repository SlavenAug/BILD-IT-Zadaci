/*
 * Napisati metodu sa sljedećim headerom:
 * public static String format(int number, int width)
 * koja vraća string broja sa prefiksom od jedne ili više nula.
 * Veličina stringa je width argument. Na primjer, ukoliko pozovemo
 * metodu format(34, 4) metoda vraća 0034, ukoliko pozovemo
 * format(34, 5) metoda vraća 00034. Ukoliko je uneseni broj veći
 * nego width argument, metoda vraća samo string broja.
 * Npr. ukoliko pozovemo format(34, 1) metoda vraća 34.
 */
package zadaci_01_02_2016;

import methods.Unos;

public class Zad4_StringFormat {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Enter a number:");
		int num = Unos.inputInt();
		System.out.println("Enter a width to show");
		int width = Unos.inputInt();

		// Pozivamo metodu i ispisujemo rezultat.
		System.out.println(format(num, width));
	}

	// Metoda formatira izlaz.
	public static String format(int num, int width) {
		// Prebacujemo int vrijednost u string.
		String format = num + "";

		// Racuna koliko nula dodati prije broja.
		int length = width - format.length();

		// Dodaje nule na pocetku stringa.
		for (int i = 0; i < length; i++) {
			format = "0" + format;
		}
		// Vracamo formatirani izgled broja.
		return format;
	}

}
