/*
 * Napisati program koji ispisuje sve prestune godine,
 * 10 po liniji, od godine 101 do 2100, odvojeno spaceom.
 * Takodje ispisati ukupan broj prijestupnih godina.
 */

package zadaci_16_01_2016;

public class Zad1_PrestupneGodine {

	public static void main(String[] args) {
        // Odredjivanje vremenskog perioda.
		final int pocetak = 101;
		final int kraj = 2100;
		// Brojac prestupnih godina.
		int brojac = 1;
		

		for (int i = pocetak; i <= kraj; i++) {
			// Provjerava da li je godina prijestupna
			if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)) {
				// Prikazujemo godinu.
				System.out.printf("%6d", i);
                // Ako je broj godina djeljiv sa 10, ispisuje novi red.
				if (brojac % 10 == 0) {
					System.out.println();
				}
				// Broji prijestupne godine
				brojac++;
			}
		}
		// Prikazuje ukupan broj prijestupnih godina
		System.out.println("\n\n  Prijestupnih godina od " + pocetak 
				+ " do " + kraj + " ima: " + (brojac - 1));

	}
}
