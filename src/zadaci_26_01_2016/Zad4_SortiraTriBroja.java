/*
 * Napisati program koji pita korisnika da unese 3
 * cijela broja te mu ispiše ta ista tri broja u rastućem
 * redosljedu. Bonus: Napisati metodu koja prima tri cijela
 * broja kao argumente te vraća brojeve u rastućem redosljedu. 
 */
package zadaci_26_01_2016;

import methods.Unos;

public class Zad4_SortiraTriBroja {
	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja
		 * programa. Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite tri cijela broja: ");
		int num1 = Unos.inputInt();
		int num2 = Unos.inputInt();
		int num3 = Unos.inputInt();
		
		// Pozivamo metodu i ispisujemo rezultat.
		sortiraBrojeve(num1, num2, num3);
		
	}
	
	public static void sortiraBrojeve(int num1, int num2, int num3){

		int temp;
		// Petlja se vrti dva puta zbog sortiranja.
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
		// Ispisuje rezultat.
		System.out.println("Brojevi u rastucem redosljedu: " + num1 + " " + num2 + " " + num3);
	}

}
