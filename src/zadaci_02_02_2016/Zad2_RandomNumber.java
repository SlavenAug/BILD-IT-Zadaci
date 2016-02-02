/*
 * Write a method that returns a random number between
 * 1 and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows:
 * public static int getRandom(int... numbers)
 */
package zadaci_02_02_2016;

public class Zad2_RandomNumber {

	public static void main(String[] args) {
		// Pozivamo metodu za prikazivanje generisanog broja.
		System.out.println(getRandom(9, 19, 29, 39, 49, 8, 18, 28, 38, 48));

	}

	public static int getRandom(int... numbers) {
		// Varijabla koja cuva nasumicni broj.
		int random = 0;
		// Postavljamo uslov petlje.
		boolean condition = true;

		while (condition) {
			// Generisanje broja.
			random = (int) (Math.random() * 54) + 1;
			// Postavljamo uslov petlje na false.
			condition = false;
			// U slucaju da se random broj nalazi u listi
			// postavi uslov petlje na true i probaj ponovo.
			for (int i : numbers) {
				if (i == random) {
					condition = true;
				}
			}

		}
		// Vraca generisani broj.
		return random;
	}

}
