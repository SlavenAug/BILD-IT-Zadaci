/*
 *  *  Zadatak 1: Pretpostavimo da uplatimo $100 svaki mjesec na
 *  �tedni ra�un koji ima godi�nju interesnu stopu od 5%. Mjese�na
 *  interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog
 *  mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417.
 *  Nakon drugog mjeseca, vrijednost na ra�unu postaje
 *  (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon tre�eg mjeseca,
 *  vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507
 *  i tako dalje. Napisati program koji pita korisnika da unese mjese�ni
 *  iznos �tednje te broj mjeseci nakon kojeg bi �elio znati stanje ra�una. 
 */
package zadaci_19_01_2016;

import methods.Unos;

public class Zad1_InteresnaStopa {

	public static void interesnaStopa(double stednja, int mjeseci) {
		// Kreira varijablu.
		double interesnaStopa = 0;
		// Petlja koja racuna interesnu stopu za odredjeni broj mjeseci.
		for (int i = 1; i <= mjeseci; i++) {
			interesnaStopa = (interesnaStopa + stednja) * (1 + 0.05 / 12);
		}

		// Ispisuje interesnu stopu za odredjeni broj mjeseci.
		System.out.printf("Interesna stopa za %d mjeseca iznosi: %3.3f", mjeseci, interesnaStopa);
	}

	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite mjesecni iznos stednje: ");
		double stednja = Unos.inputDouble();
		System.out.println("Unesite za koliko mjeseci zelite znati stanje racuna:");
		int mjeseci = Unos.inputInt();

		// Pozivamo metodu koja racuna i ispisuje 
		// interesnu stopu za odredjeni broj mjeseci.
		interesnaStopa(stednja, mjeseci);
	}

}
