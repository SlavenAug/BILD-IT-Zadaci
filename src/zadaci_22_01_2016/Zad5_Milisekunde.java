/*
 * Napisati metodu koja pretavara milisekunde u
 * sate, minute i sekunde. Metoda treba da koristi sljedeæi
 * header: public static String convertMillis(long millis).
 * Metoda treba da vraæa vrijeme kao string u formatu
 * sati:minute:sekunde.  Na primjer convertMillis(100000)
 * treba da vrati 0:1:40.
 */
package zadaci_22_01_2016;

import methods.Unos;

public class Zad5_Milisekunde {
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite milisekunde:");
		System.out.println("Sati: " + convertMillis(Unos.inputLong()));
	}
	
	public static String convertMillis (long millis){
		// Pretvara milisekunde u sekunde radi lakseg racunanja.
		int sec = (int) millis / 1000;
		// Racuna minute.
		int min = sec / 60 % 60;
		// Racuna sate.
		int h = sec / 60 / 60 % 60;
		// Vraca vrijeme.
		return h + ":" + min + ":" + sec % 60;
	}

}
