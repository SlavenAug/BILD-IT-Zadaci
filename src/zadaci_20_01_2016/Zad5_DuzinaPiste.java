/*
 * Zadatak 5: Ako imamo ubrzanje aviona a, te brzinu pri kojoj
 * avion uzlijeće v, možemo izračunati minimalnu dužinu piste
 * potrebne da avion uzleti koristeći se sljedećom formulom:
 * dužina = v * v / 2a. Napisati program koji pita korisnika da
 * unese v u m/s i a u m/s² te ispisuje korisniku minimalnu
 * dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5
 * za ubrzanje dužina piste je 514.286
 */
package zadaci_20_01_2016;

import methods.Unos;

public class Zad5_DuzinaPiste {
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite ubrzanje aviona u m/s²: ");
		double a = Unos.inputDouble();
		System.out.println("Unesite brzinu aviona u m/s: ");
		double v = Unos.inputDouble();
		// Poziva metodu i stampa rezultat.
		System.out.printf("Minimalna duzina piste je: %2.3fm", duzinaPiste(a, v));
	}
	
	// Metoda koja vraca minimalnu duzinu piste.
	public static double duzinaPiste(double a, double v){
		return((v * v) / (2 * a));
	}

}
