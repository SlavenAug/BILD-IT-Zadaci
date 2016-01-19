/*
 * Napisati metodu sa sledecim headerom koja ispisuje
 * tri broja u rastucem redosljedu:
 * public static void displaySortedNumbers
 * (double num1, double num2, double num3)
 * Napisati program koji pita korisnika da unese tri
 * broja te ispise u ratucem redosljedu.
 */
package zadaci_18_01_2016;
import methods.Unos;

public class Zad3_Sortira3Broja {
	public static void displaySortedNumbers(double num1, double num2, double num3){
		// Varijablu koristimo za trenutno smijestanje podataka.
		double temp;
		// Petlja se vrti dva puta da bi se omogucilo sortiranje tri broja.
		for (int i = 0; i < 2; i++){
			// Ako je prvi broj veci od drugog mjenja im mjesta.
			if (num1 > num2){
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			// Ako je drugi broj veci od treceg mjenja im mjesta.
			if (num2 > num3){
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
		}
		// Ispisuje sortirane brojeve
		System.out.println("Sortirano: " + num1 + " " + num2 + " " + num3);
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite prvi broj");
		double  num1 = Unos.inputDouble();
		System.out.println("Unesite drugi broj");
		double num2 = Unos.inputDouble();
		System.out.println("Unesite treci broj");
		double num3 = Unos.inputDouble();
		
		// Pozivamo metodu i stampamo sortirane brojeve.
		displaySortedNumbers(num1, num2, num3);
	}

}
