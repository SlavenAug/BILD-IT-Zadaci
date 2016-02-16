/*
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */
package zadaci_15_02_2016;

import java.util.ArrayList;

import zadaci_12_02_2016.Zad5_Loan;

public class Zad2_OutOfMemory {

	public static void main(String[] args) {

		try {
			// Pozivamo metodu koja baca exception.
			createList();
		} catch (OutOfMemoryError e) {
			// Hvatamo exception.
			// Cistimo memoriju.
			System.gc();
			// Ispisujemo poruku exceptiona.
			System.out.println(e.getMessage() + "\nCleaning up memory!");
		}
	}

	// Metod kreira listu i dodaje razne objekte.
	public static ArrayList<Object> createList() throws OutOfMemoryError {
		ArrayList<Object> list = new ArrayList<>();
		try {
			// Beskonacna petlja, sve dok se ne napuni memorija.
			for (int i = 0; i >= 0; i++) {
				list.add(new Integer(446656666));
				list.add(new Double(435488888));
				list.add(new Zad5_Loan());
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new Integer(446656666));
				list.add(new Double(435488888));
				list.add(new Zad5_Loan());
				list.add(new Integer(446656666));
				list.add(new Double(435488888));
				list.add(new Zad5_Loan());
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new String("dsfadsafh44454454sdafdffasfds436546433543335"));
				list.add(new Integer(446656666));
				list.add(new Double(435488888));
				list.add(new Zad5_Loan());
			}
		} catch (OutOfMemoryError e) {
			// Kada napuni memoriju baca excepiton.
			throw new OutOfMemoryError("Memory is full!");
		}
		return list;
	}

}
