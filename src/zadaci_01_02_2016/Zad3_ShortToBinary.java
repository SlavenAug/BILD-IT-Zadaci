/*
 * U javi, short vrijednost se sprema u samo 16 bita.
 * Napisati program koji pita korisnika da unese short broj te mu
 * ispiše svih 16 bita za dati cijeli broj. Na primjer, ukoliko
 * korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */
package zadaci_01_02_2016;

public class Zad3_ShortToBinary {

	public static void main(String[] args) {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		System.out.println("Enter short number: ");
		short num = unos.nextShort();
		// Poziva metodu i prikazuje 16bit-ni broj.
		System.out.println("16bit reprezentation of entered short number is: " + shortToBinary(num));
		unos.close();
	}

	// Metoda pretvara cijeli broj u binarni.
	public static String shortToBinary(short n) {
		// Varijabla za cuvanje binarnog broja.
		String binary = "";

		while (n > 0) {
			// Dodavanje ostatka na prvo mjesto.
			binary = n % 2 + binary;
			// Dijelimo broj sa 2.
			n /= 2;
		}

		for (int i = binary.length(); i < 16; i++) {
			// Krece od duzine stringa i dodaje nule ispred broja.
			binary = "0" + binary;
		}
		// Vraca formatirani binarni broj.
		return binary;
	}

}
