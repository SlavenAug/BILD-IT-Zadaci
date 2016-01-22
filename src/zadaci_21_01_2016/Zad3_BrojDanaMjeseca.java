package zadaci_21_01_2016;

import java.util.Scanner;

import methods.Unos;

public class Zad3_BrojDanaMjeseca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month;
		boolean cond;
		// Unos imena mjeseca. Postavljena validacija ako korisnik upise
		// nepravilno ime mjeseca, program ga upozorava da proba ponovo.
		do {
			System.out.println("Unesite ime mjeseca (npr. Jan za Januar, ili Dec za Decembar: ");
			month = input.nextLine();
			cond = Zad2_BrojDanaMjeseca.monthDayNumber(month, 0) == 0;
		} while (cond);
		// Unos godine
		System.out.println("Enter year: ");
		int year = Unos.inputInt();
		// Poziv metoda iz prethodnog zadatka za ispis imena mjeseca i broja
		// dana u mjesecu.
		System.out.println(month + " " + year + " ima " + Zad2_BrojDanaMjeseca.monthDayNumber(month, year) + " dana");
		input.close();
	}

}
