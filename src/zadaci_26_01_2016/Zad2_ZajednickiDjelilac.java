/*
 * Napisati program koji pita korisnika da unese dva cijela,
 * pozitivna broja te ispisuje najveći i najmanji zajednički djelilac za ta dva broja.
 */
package zadaci_26_01_2016;

import methods.Unos;

public class Zad2_ZajednickiDjelilac {
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
		 * programa. Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite prvi broj: ");
		int num1 = Unos.inputInt();
		System.out.println("Unesite drugi broj: ");
		int num2 = Unos.inputInt();
		// Pozivamo metode i ispisujemo rezultat.
		System.out.println("Najmanji zajednicki sadrzilac za " + num1 + " i " + num2 + " je: " + najmanjiZD(num1, num2));
		System.out.println("Najveci zajednicki sadrzilac za " + num1 + " i " + num2 + " je: " + najveciZD(num1, num2));
		
	}
	
	// Metoda pronalazi najmanji zajednicki sadrzilac.
	public static int najmanjiZD (int num1, int num2){
		for (int i = 2; i <= ((num1 < num2) ? num1 : num2); i++){
			if (num1 % i == 0 && num2 % i == 0){
				return i;
			}
		}
		return 1;
	}
	// Metoda pronalazi najveci zajednicki sadrzilac.
	public static int najveciZD(int num1, int num2){
		for (int i = ((num1 < num2) ? num1 : num2); i >= 1; i--){
			if (num1 % i == 0 && num2 % i == 0){
				return i;
			}
		}
		return 1;
	}

}
