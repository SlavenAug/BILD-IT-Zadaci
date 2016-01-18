package zadaci_15_01_2016;

public class Zad4_NasumicniBrojevi {

	public static void main(String[] args) {
		// Postavljamo brojac
		int[] brojac = new int[10];

		// Petlja koja generise 100 nasumicnih brojeva od 0 do 9.
		for (int i = 0; i < 100; i++) {
			// Za svaki nasumicni broj inkremetujemo brojac
			brojac[(int) (Math.random() * 10)]++;
		}

		// Ispisuje koliko se puta koji broj ponovio
		for (int i = 0; i < brojac.length; i++) {
			System.out.println("Broj " + i + " se ponovio: " + brojac[i] + " puta");
		}
	}

}
