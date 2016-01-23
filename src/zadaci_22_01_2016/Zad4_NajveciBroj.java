/*
 * Napišite program koji učitava neodređen broj
 * cijelih brojeva (unos prekida nula), pronalazi najveći
 * od unijetih brojeva te ispisuje koliko se najveći broj
 * puta ponovio.  Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
 * program ispisuje da je najveći broj 5 te ispisuje
 * da se isti ponavlja 4 puta. 
 */
package zadaci_22_01_2016;

import methods.Unos;

public class Zad4_NajveciBroj {
	
	
	public static void main(String[] args) {
		
		// Kreiramo varijable.
		int brojac = 0;
		int broj = 1;
		int temp = 0;
		
		while (broj != 0){
			System.out.println("Unesite broj, 0 za kraj:");
			broj = Unos.inputInt();
			
			/*
			 * Ako je broj veci od temp, onda pamtimo taj broj kao temp,
			 * i postavljamo brojac na 0 jer je to najveci broj.
			 */
			if (broj > temp){
				temp = broj;
				brojac = 0;
			}
			// Ako je broj jednak najvecem unesenom broj uvecavamo brojac.
			if (broj == temp){
				brojac++;
			}
		}
		System.out.println("najveci broj je " + temp + ", ponovio se " + brojac + " puta");
	}

}
