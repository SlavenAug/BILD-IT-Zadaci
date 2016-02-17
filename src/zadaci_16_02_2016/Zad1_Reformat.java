/*
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style.
 */
package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad1_Reformat {

public static void main(String[] args) {
		
		File file = new File("test.txt");
		if (!file.exists()) {
			System.out.println(file + " ne postoji");
			System.exit(1);
		}
		
		// Kreiramo string builder.
		StringBuilder sb = new StringBuilder();
		try {
			Scanner citac = new Scanner(file);
			while (citac.hasNext()) {
				String s = citac.nextLine();
				if (s.contains("{")) {
					sb.append(s);
				} else {
					sb.append("\n" + s);
				}
			}
			citac.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Upisuje novi izgled fajla.
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.write(sb.toString());
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Ispisujemo formatirani sadrzaj.
		System.out.println(sb);

	}
}
