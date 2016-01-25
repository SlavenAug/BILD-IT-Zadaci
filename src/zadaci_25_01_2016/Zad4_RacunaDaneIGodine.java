/*
 * Napisati program koji pita korisnika da unese
 * broj minuta (npr. 1 milijardu) te ispiše korisniku koliko
 * je to u godinama i danima. Zbog jednostavnosti,
 * pretpostavimo da godina ima 365 dana. 
 */
package zadaci_25_01_2016;

import methods.Unos;

public class Zad4_RacunaDaneIGodine {
	
	public static void main(String[] args) {
		System.out.println("Unesite broj minuta: ");
		// Unos minuta.
		long minute = Unos.inputLong();
		// Dobijamo dane.
		int dani = (int) minute / 1440;
		// Dane pretvaramo u godine.
		int godine = dani / 365;
		// Dobijamo tacne dane u godini.
		dani =  dani % 365;
		// Prikazujemo rezultat.
		System.out.println(minute + " minuta ima: " + godine + " godinu i " + dani + " dana");
	}

}
