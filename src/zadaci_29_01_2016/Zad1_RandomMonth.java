/*
 * Napisati program koji nasumično generiše cijeli
 * broj između 1 i 12 te ispisuje ime mjeseca za taj broj.
 * (Januar za 1, Ferbruar za 2....)
 */
package zadaci_29_01_2016;

public class Zad1_RandomMonth {
	
	public static void main(String[] args) {
		// Generise nasumicni broj od 1 do 12.
		int monthNumber = (int) (Math.random() * 12) + 1;
		// Poziva metodu koja vraca ime mjeseca.
		System.out.println("Random selected month is: " + monthName(monthNumber));
	}
	
	// Metoda koja vraca ime mjeseca za dati broj.
	public static String monthName(int monthNumber){
		switch (monthNumber){
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7 : return "July";
		case 8 : return "August";
		case 9 : return "Septmeber";
		case 10 : return "October";
		case 11 : return "November";
		case 12 : return "December";
		default: return "Error";
		}
	}

}
