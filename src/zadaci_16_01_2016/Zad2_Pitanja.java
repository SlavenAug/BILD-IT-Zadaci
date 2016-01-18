/*
 * Napisati metodu koja prima jedan argument, broj pitanja,
 * te generise toliko nasumicnih, jednostavnih pitanja,
 * tipa: "Koliko je: 5-2". Metoda treba da broji broj tacnih
 * i netacnih odgovora te ih ispise korisniku.
 */

package zadaci_16_01_2016;
import methods.Unos;
public class Zad2_Pitanja {

	
	public static void test(int pitanja) {
		
		// Brojac tacnih odgovora
		int tacno = 0;
		// Brojac netacnih odgovora
		int netacno = 0;
		// Korisnikov unos
		int odgovor;

		// petlja koja vrti sve dok se pitanja ne svedu na 0.
		while (pitanja > 0) {
			
            // Generisanje nasumicnih brojeva od 0 do 10.
			int broj1 = (int) (Math.random() * 11);
			int broj2 = (int) (Math.random() * 11);

			// Postavlja veci broj da bude prvi zbog oduzimanja.
			if (broj2 > broj1) {
				int temp = broj1;
				broj1 = broj2;
				broj2 = temp;
			}

			// Ispisuje koliko preostaje pitanja i postavlja pitanje.
			System.out.println("Preostaje pitanja: " + pitanja);
			System.out.println("Koliko je: " + broj1 + " - " + broj2 + " = ");
			// Unos korisnikovog odgovora.
			odgovor = Unos.inputInt();

			/*
			 * Ako je tacan odgovor ispisuje tacno i povecava brojac tacnih
			 * odgovora, u suprotnom ispisuje netacano i povecava brojac 
			 * netacnih odgovora
			 */
			if (odgovor == (broj1 - broj2)) {
				System.out.println("Tacno!");
				tacno++;
			} else {
				System.out.println("Netacan odgovor!");
				System.out.println("Tacan odgovor je: " + (broj1 - broj2));
				netacno++;
			}
			// Smanjuje broj pitanja za svaki odgovor, 
			// kada dodje do 0 prekida petlju.
			pitanja--;

		}

		// Ispisuje rezultat korisniku.
		System.out.println(
				"\n\nKonacan rezultat je:" + "\nTacnih odgovora: " + tacno + "\nNetacnih odgovora: " + netacno);
	}
	
	

	public static void main(String[] args) {

		System.out.println("Unesite broj pitanja: ");
		/*
		 * Unos pitanja zasticen da ne bi doslo do padanja programa.
		 * Metoda se nalazi u klasi Unos.
		 */
		int pitanja = Unos.inputInt();
		test(pitanja);
	}

}
