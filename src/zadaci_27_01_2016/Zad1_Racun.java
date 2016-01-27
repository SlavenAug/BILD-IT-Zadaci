/*
 * (Izračunavanje napojnice) Napisati program koji učitava
 * ukupan iznos računa koji treba uplatiti kao i procenat tog računa
 * kojeg želimo platiti kao napojnicu te izračunava ukupan račun i
 * napojnicu. Na primjer, ukoliko korisnik unese 10 kao račun i
 * 15 % kao procenat za napojnicu program treba da ispiše da je
 * ukupan račun za uplatiti 11.5 a napojnica 1.5. 
 */
package zadaci_27_01_2016;

import methods.Unos;

public class Zad1_Racun {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite iznos racuna:");
		double racun = Unos.inputDouble();
		System.out.println("Unesite napojnicu u %:");
		// Racuna procenat napojnice.
		double napojnica = Unos.inputDouble() / 100 * racun;
		// Racuna ukupni racun s napojnicom.
		double ukupanRacun = racun + napojnica;
		// Ispisuje rezultat.
		System.out.println("Ukupan racun za uplatiti je: " + ukupanRacun + "KM a napojnica iznosi " + napojnica + "KM");

	}

}
