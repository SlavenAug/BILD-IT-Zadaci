/*
 * (Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and average.
 */
package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import methods.Unos;

public class Zad5_ProcessScores {

	public static void main(String[] args) {
		// Unosimo ime fajla.
		System.out.println("Enter a filename of scores: ");
		String filename = Unos.stringNext();
		// Kreiramo input.
		Scanner input = null;
		// Kreiramo varijablu.
		double sum = 0.0;
		// Postavljamo brojac.
		int count = 0;
		double score;
		try {
			// Kreiramo skener sa zadatim fajlom.
			input = new Scanner(new File(filename));
			// Petlja ucitava sve brojeve.
			while (input.hasNext()) {
				// Trenutni broj.
				score = input.nextDouble();
				// Suma brojeva.
				sum += score;
				// Povecavamo brojac.
				count++;
			}
		} catch (FileNotFoundException e) {
			// Ako uneseni fajl ne postoji, prikazuje poruku.
			System.out.println("File not found!");
		} catch (InputMismatchException e) {
			// Ako se nalazi u fajlu neki karakter a da nije broj
			// priakazi poruku.
			System.out.println("Only numeric value is allowed!");
		} finally {
			// Zatvaramo citac.
			if (input != null) {
				input.close();
			}
		}
		// Izracunavamo prosjek.
		double average = sum / count;
		// Prikazujemo rezultat.
		System.out.println("\nTotal sum: " + sum + "\nAverage: " + average);
	}
}
