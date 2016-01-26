/*
 * Pretpostavimo da se registarska tablica za auto sastoji
 * od tri uppercase karaktera i 4 broja u sljedećem formatu AAA-1234.
 * Napisati program koji nasumično generiše tablicu.
 */
package zadaci_26_01_2016;

public class Zad1_RegistarskaTablica {

	public static void main(String[] args) {

		String tablica = "" + getChar() + getChar() + getChar() + "-" + getNum() + getNum() + getNum() + getNum();
		System.out.println(tablica);

	}

	// Metoda za generisanje nasumicnih velikih slova.
	public static char getChar() {
		return (char) ((int) (Math.random() * 26) + 65);
	}

	// Metoda za generisanje nasumicnih brojeva od 0 do 9;
	public static int getNum() {
		return (int) (Math.random() * 10);
	}

}
