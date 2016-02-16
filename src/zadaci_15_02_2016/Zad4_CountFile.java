package zadaci_15_02_2016;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Zad4_CountFile {
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("test.txt");
		// Kreiranje citaca.
		Scanner input = null;
		// Varijable koje cuvaju rezultate prebrojavanja.
		int count = 0;
		int sum = 0;
		int word = 0;
		try {
			input = new Scanner(file);
			while (input.hasNext()) {
				String chars = input.next();
				count = chars.length();
				if (count > 0) {
					// Brojac za karaktere.
					sum += count;
					// Brojac za rijeci.
					word++;
				}
			}
			// Brojimo linije.
			LineNumberReader lines = new LineNumberReader(new FileReader(file));
			String line = null;
			while ((line = lines.readLine()) != null) {
				lines.getLineNumber();
			}
			lines.close();
			// Prikaz rezultata prebrojavanja.
			System.out.println("Number of words in file: " + word);
			System.out.println("Number of lines: " + lines.getLineNumber());
			System.out.println("Number of characters: " + sum);

		} catch (FileNotFoundException e) {
			// Ako datoteka nije nadjena
			// prikazi poruku i izadji iz programa.
			System.out.println("File not found! Check your input.");
			System.exit(0);
		} finally {
			// zatvaranje ulaza
			if (input != null) {
				input.close();
			}
		}

	}
}
