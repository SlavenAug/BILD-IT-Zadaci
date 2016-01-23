/*
 * Napišite program koji ispisuje sve brojeve, 
 * d 100 do 1000, 10 brojeva po liniji, koji su djeljivi i sa
 * 5 i sa 6. Razmak između brojeva treba biti tačno jedan space. 
 */
package zadaci_22_01_2016;

public class Zad3_IspisBrojevaPoLiniji {
	
	public static void main(String[] args) {
		// Kreiramo varijable.
		int pocetak = 100;
		int kraj = 1000;
		// Postavljamo brojac za ispis po liniji.
		int brojac = 0;
		
		for (int i = pocetak; i <= kraj; i++){
			// Ako su brojevi djeljivi sa 5 i 6 
			// uvecavamo brojac i ispisujemo rezultat
			// 10 brojeva po liniji.
			if (i % 5 == 0 && i % 6 == 0){
				brojac++;
				System.out.print((brojac % 10 == 0) ? i + "\n" : i + " ");
			}
		}
	}

}
