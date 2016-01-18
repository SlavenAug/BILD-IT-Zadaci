/*
 * Napisati metodu koja prima dva argumenta: pocetni i krajnji broj,
 * te printa sve proste brojeve u zadatom rangu.
 * Bonus: Metoda moze primiti i treci argument: broj brojeva za isprintati po liniji.
 */
package zadaci_17_01_2016;
import methods.Unos;

public class Zad1_ProstiBrojevi {
	

	public static void prostiBrojevi(int pocetni, int krajnji, int linija) {
		
		// Brojac za ispis po liniji
		int brojac = 1;
		boolean prostiBrojevi = true;

		for (int i = pocetni; i <= krajnji; i++) {
			// Postavljamo da je trenutni broj prost broj.
			prostiBrojevi = true;
			// Provjerava da li je broj prost, ako nije postavlja vrijednost na false.
			for (int j = 2; j < i; j++) {
				// Ako je broj djeljiv sa nekim brojem onda nije prost.
				if (i % j == 0) {
					prostiBrojevi = false;
					break;
				}
			}

			// Ako je trenutni broj prost prikazujemo ga u konzoli.
			if (prostiBrojevi) {
				System.out.print(i + ", ");
				// Prelazimo u novi red ako je brojac djeljiv sa
				// korisnikovim unosom za broj ispisa po liniji.
				if (brojac % linija == 0) {
					System.out.println();
				}
				// Inkrementuje brojac za svaki pronadjeni prosti broj.
				brojac++;
			}

		}
	}

	
	public static void main(String[] args) {
		/*
		 * Korisnikovi unosi su zasticeni da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		System.out.println("Unesite pocetni broj: ");
		int pocetni = Unos.inputInt();
		System.out.println("Unesite krajnji broj: ");
		int krajnji = Unos.inputInt();
		System.out.println("Koliko zelite ispisati brojeva po liiji: ");
		int linija = Unos.inputInt();
		
		// U slucaju da je pocetni broj veci od krajnjog, mjenja im mjesta.
		if (pocetni > krajnji){
			int temp = pocetni;
			pocetni = krajnji;
			krajnji = temp;
		}
		
		// Pozivamo metodu za ispis prostih brojeva
		prostiBrojevi(pocetni, krajnji, linija);

	}

}
