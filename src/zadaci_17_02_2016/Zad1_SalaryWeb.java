/*
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary. Write a program to
 * display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 */
package zadaci_17_02_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1_SalaryWeb {

	public static void main(String[] args) {
		// url fajla Salary.txt
		String urlAddress = "http://cs.armstrong.edu/liang/data/Salary.txt";
		Scanner input = null;
		// Varijabla za cuvanje rezultata.
		String rank;
		double assistant = 0.0;
		double associate = 0.0;
		double full = 0;
		double total = 0;
		// Postavljamo brojace.
		int countAssistant = 0;
		int countAssociate = 0;
		int countFull = 0;
		try {
			// Kreiramo URL objekad.
			URL url = new URL(urlAddress);
			// Kreiramo citas sa url adresom.
			input = new Scanner(url.openStream());
			// Petlja koja ucitava sve brojeve.
			while (input.hasNext()) {
				// Preskacemo ime i prezime.
				input.next();
				input.next();
				// Ucitavamo zvanje zaposlenog.
				rank = input.next();
				// Ako je zaposleni asistent,
				if (rank.equals("assistant")) {
					// dodaj njegovu platu u assistant varijablu.
					assistant += input.nextDouble();
					// Uvecavamo brojac.
					countAssistant++;
					// Ako je zaposleni associte,
				} else if (rank.equals("associate")) {
					// dodaj platu i uvecaj brojac.
					associate += input.nextDouble();
					countAssociate++;
				} else {
					full += input.nextDouble();
					countFull++;
				}
			}
			// Izracunavamo ukupnu platu svih zaposlenih.
			total = assistant + associate + full;

			// Prikazujemo koliko je zaposlenih na fakultetu.
			System.out.println("Total employees on faculty: " + (countAssistant + countAssociate + countFull));

			// Prikazujemo ukupnu platu za asistente i prosjek plata i za sve
			// ostale zaposlene.
			System.out.printf("\nTotal salary for assistants is: %10.2f$\n\taverage is: %5.2f$\n", assistant,
					(assistant / countAssistant));
			System.out.printf("Total salary for associate is: %10.2f$\n\taverage is: %5.2f$\n", associate,
					associate / countAssociate);
			System.out.printf("Total salary for full profesor: %10.2f$\n\taverage is: %5.2f$\n", full,
					full / countFull);

			// Prikazujemo ukupne godisnje plate svih zaposlenih
			System.out.printf("\nTotal faculty salary: %10.2f$\n", total);
			// Prikazujemo mjesecnu platu svih zaposlenih.
			System.out.printf("Average salary on faculty is: %5.2f$\n",
					(total / (countAssistant + countAssociate + countFull)));
		} catch (MalformedURLException e) {
			System.out.println("URL not found!");
		} catch (IOException e) {
			System.out.println("Error!");
		} catch (InputMismatchException e) {
			// Ako uctitani podatak nije odgovarajuce vrijednosti.
			System.out.println("Check input format!");
		}
	}
}
