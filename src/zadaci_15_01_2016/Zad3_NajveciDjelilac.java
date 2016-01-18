package zadaci_15_01_2016;
import java.util.Scanner;

public class Zad3_NajveciDjelilac {

	public static int najveciDjelilac(int a, int b) {
		// Postavljamo najveci djelilac
		int nzd = 1;
		
		// Ako je drugi broj veci od prvog, mjenja im mjesta
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
        // Trazi najveci zajednicki djelilac
		for (int i = 1; i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				// Ako su oba broja djeljiva sa i,
				// pamti trenutnu vrijednost kao najveci zd.
				nzd = i;
			}
		}
		return nzd;

	}

	public static void main(String[] args) {
		// Kreiranje skenera
		Scanner unos = new Scanner(System.in);
		// Unos dva broja od korisnika
		System.out.println("Unesite prvi broj:");
		int prviBroj = unos.nextInt();
		System.out.println("Unesite drugi broj:");
		int drugiBroj = unos.nextInt();
		// Poziva metodu i ispisuje najveci zajednicki djelilac
		System.out.println("Najveci zajednicki djelilac je: " 
		+ najveciDjelilac(prviBroj, drugiBroj));
		
		unos.close();
	}

}
