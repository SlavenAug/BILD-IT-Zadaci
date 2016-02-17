/*
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */
package zadaci_16_02_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad4_ScoresWeb {

	public static void main(String[] args) {
		String urlAddress = "http://cs.armstrong.edu/liang/data/Scores.txt";
		Scanner input = null;
		// Kreiramo varijablu za cuvanje rezultata.
		int score = 0;
		double total = 0;
		int count = 0;
		try {
			// Kreiramo URL objekad sa datom adresom.
			URL url = new URL(urlAddress);
			// Kreiramo citac sa url adresom.
			input = new Scanner(url.openStream());
			// Petlja ucitava sve brojeve.
			while (input.hasNext()) {
				// Trenuti broj.
				score = input.nextInt();
				// Sabiranje i dodavanje u total variajblu.
				total += score;
				// Uvecavamo brojac.
				count++;
			}
			// Prikazujemo rezultat.
			System.out.println("Total scores: " + count + "\nTotal sum of scores: " + total + "\nAverage: "
					+ (total / count * 1.0));
		} catch (MalformedURLException e) {
			// Ako fajl nije nadjen na adresi, prikazi poruku.
			System.out.println("URL not found!");
		} catch (IOException e) {
			System.out.println("Error!");
		} catch (InputMismatchException e) {
			// Ako uctitani podatak nije int vrijednosti
			// prikazi poruku.
			System.out.println("Check input format!");
		}
	}
}
