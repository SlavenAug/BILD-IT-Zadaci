/*
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file.
 */
package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad3_RemoveText {
	public static void main(String[] args) throws FileNotFoundException {

		// Kreiramo novi file.
		File file = new File("test.txt");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter text: ");
		// Ispisujemo sadrzaj u file.
		try (PrintWriter output = new PrintWriter(file);) {
			output.print(input.nextLine());
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		System.out.println("Enter the word you want to remove: ");
		// Unosimo text koji zelimo izbrisati.
		String s = input.next();
		// Pozivamo metodu za brisanje odredjenog texta.
		removeTextFromFile("test.txt", s);
		// Zatvaramo skener.
		input.close();

	}

	// Metod za brisanje stringa iz file-a.
	public static void removeTextFromFile(String filename, String s) {
		// Objekat file sa putanjom.
		File file = new File(filename);
		try {
			// Varijabla za cuvanje sadrzaja file-a.
			String text = "";
			// Varijabla za cuvanje sadrzaja nakon brisanja odredjenog texta.
			String s1 = "";
			// Citamo iz file-a.
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				text = read.nextLine();
			}
			// Brisemo zeljeni text.
			s1 = text.replace(s, "");
			// Ispisujeno novi sadrzaj.
			System.out.println(s1);
			// Zatvaramo skener.
			read.close();
			PrintWriter write = new PrintWriter(file);
			// Snimamo promjenjeni text u file.
			write.println(s1);
			write.close();
		} catch (FileNotFoundException e) {
			System.out.println("File don't exists");
		}
	}

}
