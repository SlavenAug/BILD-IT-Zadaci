/*
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 */
package zadaci_16_02_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zad3_CountWords {
	public static void main(String[] args) {
		// url 
		String urlAddress = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		Scanner input = null;
		// Kreiramo varijablu za cuvanje rijeci.
		int words = 0;
		try {
			// Kreiramo URL objekad sa datom adresom (url).
			URL url = new URL(urlAddress);
			// Kreiramo citas sa url adresom.
			input = new Scanner(url.openStream());
			while (input.hasNext()) {
				// Odredjujemo koliko ima rijeci u liniji teksta tako sto
				// splitujemo ucitanu liniju na svakom razmaku.
				words += input.nextLine().split(" ").length;
			}
			// Prikazujemo broj rijeci u tekstu.
			System.out.println("Number of words in Lincoln.txt is: " + words);
		} catch (MalformedURLException e) {
			// Ako fajl nije nadjen na adresi, prikazi poruku.
			System.out.println("URL not found!");
		} catch (IOException e) {
			System.out.println("Error!");
		}
	}
}
