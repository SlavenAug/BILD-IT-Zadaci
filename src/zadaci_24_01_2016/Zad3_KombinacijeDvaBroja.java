/*
 * Napisati program koji ispisuje sve mogu�e
 * kombinacije za biranje dva broja u rasponu od 1 do 7.
 * Tako�er, program ispisuje broj svih mogu�ih kombinacija. 
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u
 * datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih
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
