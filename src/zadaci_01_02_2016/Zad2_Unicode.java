/*
 * Napisati program koji prima karakter te vraća njegov Unicode.
 * Primjer: ukoliko korisnik unese karakter E program mu vraća
 * 69 kao unicode za taj karakter.
 */
package zadaci_01_02_2016;

public class Zad2_Unicode {
	
	public static void main(String[] args) {
		
		java.util.Scanner unos = new java.util.Scanner(System.in);
		System.out.println("Enter a character: ");
		// Unosimo karakter, typecasting u int i prikazujemo rezultat.
		System.out.println("Unicode for entered char is: " + (int)unos.next().charAt(0));
		unos.close();
	}

}
