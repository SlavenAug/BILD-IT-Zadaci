/*
 * Pretpostavimo da kupujemo rižu ili neki drugi
 * proizvod u dva različita pakovanja. Želimo napisati program
 * koji upoređuje cijene ta dva pakovanja. Program pita korisnika
 * da unese težinu i cijenu oba pakovanja te ispisuje
 * koje pakovanje ima bolju cijenu.
 */
package zadaci_27_01_2016;

import methods.Unos;

public class Zad5_BoljaCijena {

	public static void main(String[] args) {

		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite cijenu prvog pakovanja u KM");
		double cijena1 = Unos.inputDouble();
		System.out.println("Unesite tezinu prvog pakovanja u gramima");
		double tezina1 = Unos.inputDouble();
		System.out.println("Unesite cijenu drugog pakovanja u KM");
		double cijena2 = Unos.inputDouble();
		System.out.println("Unesite tezinu drugog pakovanja u gramima");
		double tezina2 = Unos.inputDouble();

		/*
		 * Ako je odnos cijene i tezine jednog paketa veci, onda taj paket ima
		 * bolju cijenu. Pozivamo metodu za odnos cijene i tezine i ispisujemo
		 * rezulta.
		 */
		if (odnosCijeneITezine(cijena1, tezina1) > odnosCijeneITezine(cijena2, tezina2)) {
			System.out.println("Prvo pakovanje ima bolju cijenu!");
		} else if (odnosCijeneITezine(cijena1, tezina1) < odnosCijeneITezine(cijena2, tezina2)) {
			System.out.println("Drugo pakovanje ima bolju cijenu!");
		} else {
			System.out.println("Oba pakovanja imaju istu cijenu!");
		}

	}

	// Metoda koja racuna odnos cijene i tezine proizvoda.
	public static double odnosCijeneITezine(double cijena, double tezina) {
		return tezina / cijena;
	}

}
