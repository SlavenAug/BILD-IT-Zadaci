/*
 * (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. Each file contains one thousand lines. Each line
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
 * and number for the girl’s name.
 */
package zadaci_17_02_2016;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

import methods.Unos;

public class Zad3_BabyNames {

	public static void main(String[] args) {
		// Varijabla za unos godine.
		System.out.println("Enter the year: ");
		int year = Unos.inputInt();
		// Kreiranje File objekta.
		File file = new File("babynameranking" + year + ".txt");
		// Ako fajl postoji,
		if (file.exists()) {
			// unosimo pol,
			System.out.println("Enter the gender M (male) F (feemale): ");
			String gender = Unos.stringNext().toUpperCase();
			// ako je pol ispravno unesen, nastavi dalje sa izvrsavanjem,
			if (gender.equals("M") || gender.equals("F")) {
				// unosimo ime.
				System.out.println("Enter the name: ");
				String name = Unos.stringNext();
				// Kreiramo citac.
				Scanner input = null;
				try {
					// Inicijalizacija citaca.
					input = new Scanner(file);
					boolean isFound = false;
					while (input.hasNext()) {
						// ucitavamo redni broj,
						int rankNumber = input.nextInt();
						// ucitavamo musko ime,
						String tempMName = input.next();
						// ucitavamo zensko ime,
						String tempFName = input.next();
						// ako je pronadjeno ili musko ili zensko ime,
						if (name.equals(tempFName) || name.equals(tempMName)) {
							// prikazi rank, ime i godinu,
							System.out.println(name + " is ranked #" + rankNumber + " in year " + year);
							// postavljamo na true i prekidamo petlju.
							isFound = true;
							break;
						}
					}
					// Ako nije nadjeno ime,
					if (!isFound) {
						System.out.println("The name " + name + " is not ranked in year " + year);
					}
				} catch (InputMismatchException e) {
					// Ako je doslo do greske tokom ucitavanja,
					System.out.println("Redaing error!");
				} catch (Exception e) {
					// ili neka druga greska,
					System.out.println("Error occured!");
				} finally {
					// zatvaramo ulaz.
					if (input != null) {
						input.close();
					}
				}
			} else {
				// ako je pogresan unos.
				System.out.println("Try again! Exiting!");
				// izlazi iz programa.
				System.exit(0);
			}
		} else {
			// Ako fajl nije pronadjen.
			System.out.println("File " + file.getName() + " does not exsist! Check your input!");
		}
	}
}
