/*
 * Napisati program koji ispisuje sve prijestupne
 * godine, 10 po liniji, u rasponu godina koje korisnik unese.
 * Program pita korisnika da unese pocetnu godinu, krajnju godinu
 * te ispisuje sve godine u tom rasponu. Razmak izmedju godina
 * treba biti jedan space. 
 */
package zadaci_20_01_2016;

import methods.Unos;

public class Zad2_PrijestupneGodine {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite pocetnu godinu:");
		int pocetnaGodina = Unos.inputInt();
		System.out.println("Unesite krajnju godinu:");
		int krajnjaGodina = Unos.inputInt();

		// Poziva metodu za pronalazenje prijestupnih godina.
		prijestupneGodine(pocetnaGodina, krajnjaGodina);

	}

	/*
	 * Metoda za pronalazenje i prikazivanje prijestupnih godina.
	 */
	public static void prijestupneGodine(int pocetnaGodina, int krajnjaGodina) {
		// Kreiramo brojac.
		int brojac = 0;
		int temp = 0;
		// U slucaju da je pocetna godina veca
		// mijenja vrijednosti pocetne i krajnje godine.
		if (pocetnaGodina > krajnjaGodina) {
			temp = pocetnaGodina;
			pocetnaGodina = krajnjaGodina;
			krajnjaGodina = temp;
		}

		
		for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {
			// Ako je godina djeljiva sa 400, ili ako nije djeljiva sa 100,
			// a djeljiva je sa 4 onda je prijestupna.
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
				// Ispisuje prijestupne godine i uvecava brojac.
				System.out.print(i + " ");
				brojac++;
				// Ako je brojac djeljiv sa 10 ispisuje novi red,
				// i postavlja novu vrijednost brojaca.
				if (brojac % 10 == 0) {
					System.out.println();
					brojac = 0;
				}
			}
		}
	}
}
