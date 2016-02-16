/*
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 */
package zadaci_15_02_2016;

import methods.Unos;

public class Zad1_Bin2Dec {

	public static void main(String[] args) {
		// Postavljamo uslov petlje.
		boolean condition = true;
		while (condition) {
			// Unosenje stringa.
			System.out.println("Enter a binary value: ");
			String binaryString = Unos.stringNext();
			try {
				// Pozivamo metod za konvertovanje binarnog broja u decimalni,
				// ako uneseni broj nije binarni broj metod baca exception.
				System.out.println("Decimal value is: " + bin2Dec(binaryString));
				// Ako je binarni broj validan prekidamo petlju.
				condition = false;
			} catch (NumberFormatException e) {
				// Prikazuje poruku exception-a.
				System.out.println(e.getMessage() + "\nTry again!");
			}
		}
	}

	// Metod za konvertovanje binarnog broja u decimalni.
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		// Kreiramo varijablu za cuvanje decimalnog broja.
		int dec = 0;
		// Kreiramo varijablu za cuvanje trenutnog binarnog broja.
		int temp = 0;

		// Index i sluzi kao stepen broja, a j sluzi da
		// karakter stringa izvlacimo od zadnje pozicije.
		for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
			// Ako je znak 0 dodaj 0 u temp.
			if (binaryString.charAt(j) == '0') {
				temp = 0;
				// Ako je znak 1 dodaj 1 u temp;
			} else if (binaryString.charAt(j) == '1') {
				temp = 1;
			} else {
				// Ako nije ni 0 ni 1 baci exception.
				throw new NumberFormatException("String is not binary");
			}
			// Racuna se po formuli: (bin) * 2^i.
			dec += temp * (int) (Math.pow(2, i));
		}
		// Vraca konvertovani decimalni broj.
		return dec;
	}

}
