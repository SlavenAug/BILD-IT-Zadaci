/*
 * Napisati program koji u�itava iznos investicije, godi�nju interesnu
 * stopu i broj godina te vra�a budu�u vrijednost investicije
 * koriste�i se sljede�om formulom:
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25
 * kao godi�nju interesnu stopu i 1 kao broj godina program
 * vam vra�a 1032.98 kao buducu vrijednost investicije.
 */
package zadaci_20_01_2016;

import methods.Unos;

public class Zad1_BuducaVrijednostInvesticije {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite iznos investicije: ");
		double investicija = Unos.inputDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double interesnaStopa = Unos.inputDouble();
		System.out.println("Unesite broj godina: ");
		int godine = Unos.inputInt();

		// Poziv metode za racunanje kamatne stope.
		System.out.printf("Buduca vrijednost investicije je: %5.2f",
				vrijednostInvesticije(investicija, interesnaStopa, godine));
	}

	/*
	 * Metod za racunanje kamatne stope.
	 */
	public static double vrijednostInvesticije
	(double investicija, double interesnaStopa, int godine) {
		// Formula za racunanje kamatne stope.
		return investicija * Math.pow(1 + (interesnaStopa / 100.0 / 12.0), (godine * 12));
	}
}
