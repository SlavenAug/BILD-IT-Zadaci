/*
 * Napisati program koji pita korisnika da unese
 * neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
 */
package zadaci_30_01_2016;

import methods.Unos;

public class Zad2_String {
	
	public static void main(String[] args) {
		// Unos stringa.
		System.out.println("Unesite neki string: ");
		String s = Unos.stringNextLine();
		// Racunamo duzinu i prikazujemo prvi karakter stringa.
		System.out.println("String lenght is: " + s.length() + "\nFirst character is: " + s.charAt(0));
	}

}
