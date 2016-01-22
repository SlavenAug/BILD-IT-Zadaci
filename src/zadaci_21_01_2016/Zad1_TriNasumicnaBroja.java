/*
 * Napisati program koji ispisuje tri nasumièna 
 * cijela broja te pita korisnika da unese njihov zbir.
 * Ukoliko korisnik pogriješi, program ispisuje pitanje
 * ponovo sve sa porukom da pokuša ponovo. Ukoliko
 * korisnik unese taèan odgovor, program mu
 * èestita i završava sa radom.
 */
package zadaci_21_01_2016;

import methods.Unos;

public class Zad1_TriNasumicnaBroja {
	
	public static void main(String[] args) {
		// Generisanje nasumicnih brojeva za sabiranje
		// i kreiranje uslova za petlju.
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		int result = num1 + num2 + num3;
		boolean cond;
		// Petlja pita korisnika da unese tacan rezultat
		// ako ne unese trzice od korisnika da proba ponovo.
		do {
			System.out.println("Koliko je:  " + num1 + " + " + num2
					+ " + " + num3 + " = ");
			// Unos i provjera rezultata.
			cond = result == Unos.inputInt();
			// Ako rezultat nije tacan ispisi poruku korisniku da proba ponovo.
			if (!cond) {
				System.out.println("Niste unijeli tacan rezultat, pokusajte ponovo!");
			}
		} while (!cond);
		// Prikaz tacnog rezulata.
		System.out.println("Tacno! " + num1 + " + " + num2 + " + " + num3
				+ " = " + result);
	}
	

}
