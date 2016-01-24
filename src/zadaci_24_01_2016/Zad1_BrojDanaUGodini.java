/*
 * Napisati metodu koja vraæa broj dana u godini.
 * Metoda koristi sljedeæi header:
 * public static int numberOfDayInAYear(int year). Napisati
 * program koji pita korisnika da unese poèetnu godinu, krajnju
 * godinu te ispisuje broj dana za svaku godinu u rasponu.
 */
package zadaci_24_01_2016;

import methods.Unos;

public class Zad1_BrojDanaUGodini {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite pocetnu godinu:");
		int pocetna = Unos.inputInt();
		System.out.println("Unesite krajnju godinu");
		int krajnja = Unos.inputInt();
		int brojac = 0;
		int temp;
		
		// U slucaju da je pocetna godina veca od krajnje,
		// mjenja im mjesta.
		if (pocetna > krajnja){
			temp = pocetna;
			pocetna = krajnja;
			krajnja = temp;
					
		}
	
		// Petlja koja ispisuje sve godine i broj dana u godini,
		// 10 po liniji.
		for (int i = pocetna; i <= krajnja; i++) {
			// Ispisujemo rezultat i uvecavamo brojac.
			System.out.print(i + "-" + numberOfDayInAYear(i) + ": ");
			brojac++;
			// Ako je brojac djeljiv sa 10 prelazi u novi red.
			if (brojac % 10 == 0){
				System.out.println();	
			}
		}

	}

	static int numberOfDayInAYear(int year) {
		int dani = 365;
		// Ako je prijestupna godina postavljamo broj dana na 366.
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			dani = 366;
		}
		return dani;
	}

}
