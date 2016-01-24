/*
 * Napisati program koji ispisuje sve moguæe
 * kombinacije za biranje dva broja u rasponu od 1 do 7.
 * Takoðer, program ispisuje broj svih moguæih kombinacija. 
 * Dakle, program treba da ispiše sve moguæe parove brojeva u
 * datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih
 * kombinacija je 21. 
 */
package zadaci_24_01_2016;

public class Zad3_KombinacijeDvaBroja {
	
	public static void main(String[] args) {
		// Kreiramo varijable.
		final int broj1 = 1;
		final int broj2 = 7;
		int brojac = 0;
		// Petlja vrti od prvog do zadnjeg broja.
		for (int i = broj1; i < broj2; i++){
			// Petlja vrti od prvog broja  uvecanog za 1, do zadnjeg broja.
			for (int j = i + 1; j <= broj2; j++){
				// Prikazujemo kombinacije.
				System.out.print(brojac % 3 == 0 ? "\n" + i + "," + j + ";  " : i + "," + j + ";  ");
				// Uvecavamo brojac.
				brojac++;
			}
		}
		System.out.println("\nBroj mogucih kombinacija je: " + brojac);
	}

}
