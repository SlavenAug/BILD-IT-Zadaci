/*
 * Zadatak 4:  Napisati program koji pita korisnika da unese
 * neki string te mu ispisuje sve karaktere koji se nalaze na
 * neparnim pozicijama. Na primjer, ako korisnik unese string
 * Beijing Chicago, program vraca BiigCiao.
 */
package zadaci_20_01_2016;

import methods.Unos;

public class Zad4_KarakteriNeparnihPozicija {

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite neki string: ");
		String s = Unos.stringNextLine();
		// Poziva metodu i stampa rezultat.
		System.out.println(neparnePozicije(s));

	}

	// Metoda koja vraca neparne pozicije Stringa.
	public static String neparnePozicije(String s) {
		String n = "";

		// Petlja koja se uvecava za 2 svaki put, i
		// dodaje karaktere sa neparnih pozicija stringa.
		for (int i = 0; i < s.length(); i += 2) {
			n += s.charAt(i);

		}
		// Vraca string sa neparnim pozicijama.
		return n;
	}
}
