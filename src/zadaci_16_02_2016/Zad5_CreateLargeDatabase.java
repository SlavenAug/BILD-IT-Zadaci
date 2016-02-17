/*
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 */
package zadaci_16_02_2016;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Zad5_CreateLargeDatabase {

	public static void main(String[] args) {

		PrintWriter pw = null;

		try {
			// Kreiranje PrintWritera, u fajl ce se dodavati red po red.
			pw = new PrintWriter(new FileOutputStream(new File("Salary.txt"), true));
			// Dodaje se tabela u fajl.
			for (int i = 1; i <= 1000; i++) {
				// Generisi zvanje
				String rank = randomRank();
				// Dodaj generisani red.
				pw.append("FirstName" + i + " LastName" + i + " " + rank + " " + generateSalary(rank) + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Zatvori PrintWriter.
			pw.close();
			System.out.println("Database generated");
		}
	}

	// Metod generise nasumiocno zvanje zaposlenog.
	public static String randomRank() {
		String[] rank = { "assistant", "associate", "full" };
		return rank[(int) (Math.random() * 3)];
	}

	// Meotd generise godisnja platu za odredjeno zvanje zaposlenog.
	static double generateSalary(String rank) {
		// Ako je asistent generisi platu izmedju 50000 i 80000.
		if (rank.equals("assistant")) {
			return (int) ((Math.random() * 3000000) + 5000000) / 100.0;
			// Ako je associate generisi platu izmedju 60000 i 110000.
		} else if (rank.equals("associate")) {
			return (int) ((Math.random() * 5000000) + 6000000) / 100.0;
		} else {
			// Ako je asistent generisi platu izmedju 75000 i 130000.
			return (int) ((Math.random() * 5500000) + 7500000) / 100.0;
		}
	}
}
