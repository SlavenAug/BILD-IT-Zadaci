package zadaci_15_01_2016;

import java.util.Scanner;

public class Zad2_SamoglasnikSuglasnik {
	
	

	/*
	 * Metoda koja broji samoglasnike i suglasnike u stringu
	 */
	public static void countLetters(String s) {
		/*
		 * Konvertujemo sva slova u lower case, zato sto cemo koristiti ASCIII
		 * kod.
		 */
		s = s.toLowerCase();
		// Postavljamo brojac za samoglasnike
		int samoglasnici = 0;
		// Postavljamo brojac za suglasnike
		int suglasnici = 0;

		for (int i = 0; i < s.length(); i++) {
			/*
			 * Provjeravamo svaki unijeti karakter, je li samoglasnik ili
			 * suglasnik
			 */
			char k = s.charAt(i);

			if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u') {
				// Ako je karakter samoglasnik, inkrementujemo brojac.
				samoglasnici++;
			} else if (k > 97 && k < 123) {
				// Ako je karakter suglasnik, inkrementujemo brojac.
				suglasnici++;
			}
		}

		System.out.println("samoglasnika: " + samoglasnici + "\nsuglasnika: " + suglasnici);
	}

	
	
	public static void main(String[] args) {
		// Kreiranje skenera za unos
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite string: ");
		// Unos stringa
		String s = unos.nextLine();

		System.out.println("Unijeli ste: " + s);
		countLetters(s);
		// Zatvaramo skener
		unos.close();

	}

}