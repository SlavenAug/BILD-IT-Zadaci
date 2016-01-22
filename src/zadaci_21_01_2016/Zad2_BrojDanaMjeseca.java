/*
 * Napisati program koji pita korisnika  da
 * unese mjesec i godinu te mu ispiše broj dana u datom mjesecu.
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao
 * mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana.
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
 * program treba ispisati da je Mart 2015 imao 31 dan. 
 */
package zadaci_21_01_2016;

import methods.Unos;

public class Zad2_BrojDanaMjeseca {

	public static void main(String[] args) {
		int month;
		// Unos broja mjeseca. Postavljena validacija ako korisnik upise
		// nepravilan broj mjeseca, program ga upozorava da proba ponovo.
		do {
			System.out.println("Unesite broj mjeseca (npr 1 za Jan ili 12 za Dec): ");
			month = Unos.inputInt();
		} while (month < 1 || month > 12);
		// Unos godine
		System.out.println("Unesite godinu: ");
		int year = Unos.inputInt();
		// Poziv metoda za ispis imena mjeseca i broja dana u mjesecu.
		System.out.println(monthName(month) + " " + year + " ima " + monthDayNumber(monthName(month), year) + " dana");
	}

	// Provjerava da li je godina prijestupna.
	public static boolean isLeap(int year) {
		return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
	}

	public static int monthDayNumber(String month, int year) {
		switch (month) {
		case "Jan":
			return 31;
		case "Feb":
			return isLeap(year) ? 29 : 28;
		case "Mar":
			return 31;
		case "Apr":
			return 30;
		case "May":
			return 31;
		case "Jun":
			return 30;
		case "Jul":
			return 31;
		case "Aug":
			return 31;
		case "Sep":
			return 30;
		case "Oct":
			return 31;
		case "Nov":
			return 30;
		case "Dec":
			return 31;
		default:
			return 0;
		}
	}

	public static String monthName(int month) {
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		return months[month - 1];
	}

}
