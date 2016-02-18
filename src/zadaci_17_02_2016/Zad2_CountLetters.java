/*
 * (Occurrences of each letter) Write a program that prompts the user to enter
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive.
 */
package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad2_CountLetters {

	public static void main(String[] args) {
		// Kreiramo brojac duzine 26 za svako slovo u engleskom alfabetu.
		int[] count = new int[26];
		String line = "";
		File file = new File("Lincoln.txt");
		// Kreiramo citac.
		Scanner input = null;
		try {
			input = new Scanner(file);
			// U petlji se ucitavaju linije teksta pri svakoj iteraciji i
			// provjerava se svako slovo u ucitanoj liniji.
			while (input.hasNext()) {
				// Ucitaj liniju teksta iz fajla i konvertuj u velika slova.
				line = input.nextLine().toUpperCase();
				for (int i = 0; i < line.length(); i++) {
					// Uzimamo trenutni karakter.
					char ch = line.charAt(i);
					// Ako je karakter veliko slovo,
					if (ch >= 'A' && ch <= 'Z') {
						// povecaj brojaz za jedan
						// indeks se odredjuje tako sto se uzme vrijednost
						// char i oduzme od 65, zbog pozicije u ASCII
						// tabeli. npr. 'A' - 65 je nula i vrijednost na
						// indeksu se povecava za jedan
						count[ch - 65]++;
					}
				}
			}

			// Ispisujemo rezultat.
			for (int i = 0; i < count.length; i++) {
				// prikazujemo slovo i vrijednost u nizu
				// ako je i = 1 onda je 'A' + i = B
				System.out.println("Number of " + (char) ('A' + i) + "'s: " + count[i]);
			}

		} catch (FileNotFoundException e) {
			// Ako uneseno ime fajla ne postoji, prikazi poruku.
			System.out.println("File " + file + " does not exist! Check your input");
		} finally {
			// Zatvaramo citac.
			if (input != null) {
				input.close();
			}
		}
	}
}
